package com.crud.cruddevicegateway.dao.dao;

import com.crud.cruddevicegateway.dao.Conexion;
import com.crud.cruddevicegateway.dao.entity.Device;
import com.crud.cruddevicegateway.dao.entity.Gateway;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class GatewayDao {
    private Conexion conexion = new Conexion();
    private Connection conn = conexion.conectarMySQL();

    public boolean createGateway(Gateway gateway) {
        boolean result = false;
        String query = "INSERT INTO gateway (ID, NAME, ADDRESS) VALUES(?,?,?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1,gateway.getId());
            preparedStatement.setString(2,gateway.getName());
            preparedStatement.setString(3,gateway.getAddress());
            preparedStatement.execute();
            preparedStatement.close();
            for (Device device : gateway.getDevices()){
                query = String.format("INSERT INTO device (vendor, datecreation, status, id_gateway) VALUES(%s,%s,%s,%s)"
                        ,device.getVendor(),device.getCreationDate(),device.getStatus(),gateway.getId());
                preparedStatement = conn.prepareStatement(query);
                preparedStatement.execute();
                preparedStatement.close();
            }
            result = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean deleteGateway(String id){
        boolean result = false;
        String query = "DELETE  from gateway  where ID=".concat(id);
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.execute();
            result = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
}
