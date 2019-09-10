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
@Table ( name ="admin" )
public class Admin  implements Serializable {

	private static final long serialVersionUID =  1497583011772255517L;

	@Id
	@GeneratedValue
   	@Column(name = "a_id" )
	private Long aId;

   	@Column(name = "a_name" )
	private String aName;

   	@Column(name = "a_password" )
	private String aPassword;

   	@Column(name = "a_sex" )
	private String aSex;

}
