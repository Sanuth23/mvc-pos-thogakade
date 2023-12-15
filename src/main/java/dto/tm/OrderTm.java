package dto.tm;

import com.jfoenix.controls.JFXButton;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OrderTm {
    private String code;
    private String desc;
    private int qty;
    private double amount;
    private JFXButton btn;

}
