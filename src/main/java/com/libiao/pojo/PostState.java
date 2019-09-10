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
@Table ( name ="post_state" )
public class PostState  implements Serializable {

	private static final long serialVersionUID =  1991559125628212285L;

	@Id
	@GeneratedValue
   	@Column(name = "ps_id" )
	private Long psId;

   	@Column(name = "p_id" )
	private Long pId;

   	@Column(name = "s_id" )
	private Long sId;

}
