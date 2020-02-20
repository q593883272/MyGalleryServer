package com.raven.gallery.data.nosql.po.pictorial;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "pictorial_info")
public class PictorialInfo implements Serializable {

    @Id
    private String id;

    private String pictorialName;

    private String pictorialAuthor;

    private Boolean sensitive;

    private String pictorialTitle;

    private String pictorialFrontCover;

    private String pictorialScore;

    private Integer pictorialCommentNum;

    private Integer pictorialLikeNum;

    private Integer pictorialFavoriteNum;

    private String updateUser;

    private Date updateDate;

    private String createUser;

    private Date createDate;

    @DBRef
    private List<PictorialTag> pictorialTags;
}