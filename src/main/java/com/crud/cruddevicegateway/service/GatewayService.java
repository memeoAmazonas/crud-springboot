package com.crud.cruddevicegateway.service;

import com.crud.cruddevicegateway.dao.dao.GatewayDao;
import com.crud.cruddevicegateway.dao.entity.Gateway;
import org.springframework.stereotype.Service;

@Service
public class GatewayService {
    GatewayDao gatewayDao = new GatewayDao();
    public boolean createGateway(Gateway gateway){
        if (isValidaIp(gateway.getAddress())){
            return gatewayDao.createGateway(gateway);
        }else{
           return false;
        }
    }
    public boolean deleteGateway(String id){
        return gatewayDao.deleteGateway(id);
    }
    private boolean isValidaIp(String ip){
        String regex ="^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$";
        return ip.matches(regex);
    }
}
