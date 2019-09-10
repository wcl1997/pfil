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
@Table ( name ="user_diss" )
public class UserDiss  implements Serializable {

	private static final long serialVersionUID =  4182557653136707531L;

	@Id
	@GeneratedValue
   	@Column(name = "ud_id" )
	private Long udId;

   	@Column(name = "diss" )
	private Long diss;

   	@Column(name = "be_diss" )
	private Long beDiss;

}
