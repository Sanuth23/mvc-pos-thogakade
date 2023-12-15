package model.impl;

import dto.OrderDetailDto;
import model.OrderDetailModel;

import java.sql.SQLException;
import java.util.List;

public class OrderDetailModelImpl implements OrderDetailModel {

    @Override
    public boolean saveOrderDetails(List<OrderDetailDto> list) throws SQLException, ClassNotFoundException {
        return false;
    }
}
