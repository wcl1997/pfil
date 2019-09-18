package com.libiao.pojo;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

/**
 * @Description  
 * @Author  Libiao
 * @Date 2019-09-10 
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="post" )
public class Post  implements Serializable {

	private static final long serialVersionUID =  4860444545596913714L;

	@Id
	@GeneratedValue
   	@Column(name = "p_id" )
	private Integer pId;

   	@Column(name = "p_time" )
	private Date pTime;

   	@Column(name = "p_title" )
	private String pTitle;

   	@Column(name = "p_state" )
	private Long pState;

   	@Column(name = "p_collect" )
	private Long pCollect;

   	@Column(name = "p_approve" )
	private Long pApprove;

   	@Column(name = "p_diss" )
	private Long pDiss;

   	@Column(name = "p_content" )
	private String pContent;

   	@Column(name = "p_img" )
	private String pImg;

}
