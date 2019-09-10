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
@Table ( name ="admin_post" )
public class AdminPost  implements Serializable {

	private static final long serialVersionUID =  3714379546184450968L;

	@Id
	@GeneratedValue
   	@Column(name = "ap_id" )
	private Long apId;

   	@Column(name = "a_id" )
	private Long aId;

   	@Column(name = "p_id" )
	private Long pId;

}
