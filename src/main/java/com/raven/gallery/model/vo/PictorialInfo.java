package com.raven.gallery.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * Created By Raven on 2020/2/7 14:51
 * 画报信息
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class PictorialInfo {

    private Integer id;

    private String pictorialName;

    private String pictorialAuthor;

    private Boolean sensitive;

    private String pictorialTitle;

    private String pictorialFrontCover;

    private String updateUser;

    private Date updateDate;

    private String createUser;

    private Date createDate;

    private String pictorialScore;

    private Integer pictorialCommentNum;

    private Integer pictorialLikeNum;

    private Integer pictorialFavoriteNum;

}
