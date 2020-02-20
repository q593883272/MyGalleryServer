package com.raven.gallery.data.sql.po.pictorial;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class PictorialBook {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    private Integer pictorialInfoId;

    private Integer bookFilesSize;

    private Integer bookSequence;

}