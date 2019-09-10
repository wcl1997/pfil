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
@Table ( name ="pet" )
public class Pet  implements Serializable {

	private static final long serialVersionUID =  6046873437767632859L;

	@Id
	@GeneratedValue
   	@Column(name = "p_id" )
	private Long pId;

   	@Column(name = "p_name" )
	private String pName;

   	@Column(name = "p_sex" )
	private String pSex;

   	@Column(name = "p_species" )
	private String pSpecies;

   	@Column(name = "u_id" )
	private Long uId;

}
