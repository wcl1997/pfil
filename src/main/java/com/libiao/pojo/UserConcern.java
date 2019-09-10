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
@Table ( name ="user_concern" )
public class UserConcern  implements Serializable {

	private static final long serialVersionUID =  4914336512203390053L;

	@Id
	@GeneratedValue
   	@Column(name = "uc_id" )
	private Long ucId;

   	@Column(name = "concern" )
	private Long concern;

   	@Column(name = "be_concern" )
	private Long beConcern;

}
