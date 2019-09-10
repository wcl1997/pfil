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
@Table ( name ="state" )
public class State  implements Serializable {

	private static final long serialVersionUID =  1820692160072248918L;

	@Id
	@GeneratedValue
   	@Column(name = "s_id" )
	private Long sId;

   	@Column(name = "s_name" )
	private String sName;

}
