package com.raven.gallery.data.sql.po.pictorial;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class PictorialInfo {

    @Id
    @GeneratedValue(generator = "JDBC")
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
}