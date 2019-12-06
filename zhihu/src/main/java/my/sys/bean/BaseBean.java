package my.sys.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseBean  implements Serializable{

    private Date createTime;

}
