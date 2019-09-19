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
@Table ( name ="post_user" )
public class PostUser  implements Serializable {

	private static final long serialVersionUID =  9007127787570724265L;

	@Id
	@GeneratedValue
   	@Column(name = "pu_id" )
	private Long puId;

   	@Column(name = "p_id" )
	private Long pId;

   	@Column(name = "u_id" )
	private Long uId;

   	@Column(name="pu_state")
	private String pustate;

}
