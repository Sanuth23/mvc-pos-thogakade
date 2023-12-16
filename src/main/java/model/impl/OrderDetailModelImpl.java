package model.impl;

import db.DBConnection;
import dto.OrderDetailDto;
import model.OrderDetailModel;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class OrderDetailModelImpl implements OrderDetailModel {

    @Override
    public boolean saveOrderDetails(List<OrderDetailDto> list) throws SQLException, ClassNotFoundException {
        boolean isDetailsSaved = true;
        for (OrderDetailDto dto:list) {
            String sql = "INSERT INTO orderdetail VALUES(?,?,?,?)";
            PreparedStatement pstm = DBConnection.getInstanceOf().getConnection().prepareStatement(sql);
            pstm.setString(1,dto.getOrderId());
            pstm.setString(2,dto.getItemCode());
            pstm.setInt(3,dto.getQty());
            pstm.setDouble(4,dto.getUnitPrice());

            if(!(pstm.executeUpdate()>0)){
                isDetailsSaved = false;
            }
        }
        return isDetailsSaved;    }
}
