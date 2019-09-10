package com.libiao.pojo;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description  
 * @Author  Libiao
 * @Date 2019-09-10 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="admin_user" )
public class AdminUser  implements Serializable {

	private static final long serialVersionUID =  1766732910232478328L;

	@Id
	@GeneratedValue
   	@Column(name = "au_id" )
	private Long auId;

   	@Column(name = "a_id" )
	private Long aId;

   	@Column(name = "u_id" )
	private Long uId;

}
