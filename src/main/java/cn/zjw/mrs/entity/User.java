package cn.zjw.mrs.entity;

import cn.zjw.mrs.enums.RegionEnum;
import cn.zjw.mrs.enums.SexEnum;
import cn.zjw.mrs.enums.TypeEnum;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * 用户id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 密码
     */
    private String password;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 性别（0表示女，1表示男，2表示保密）
     */
    private SexEnum sex;

    /**
     * 状态
     */
    private Integer state;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}