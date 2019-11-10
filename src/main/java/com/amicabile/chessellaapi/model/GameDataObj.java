package com.amicabile.chessellaapi.model;



import lombok.*;


import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@ToString
@EqualsAndHashCode
@Table(name = "GAME_DATA_OBJ")
public class GameDataObj implements Serializable {
   @Id
   @Column(name = "GAME_ID")
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   @Column
   private boolean publicgame;

   @Column
   private boolean deleted;

   @Column
   private String annotator;

   @Column
   private int boardnumber;


   @Column
   private String white;

   @Column
   private String black;


   @Column
   private String result;


   @Column
   private Date date;


   @Column
   private String event;


   @Column
   private String site;


   @Column
   private String round;


   @Column
   private String eco;


   @Column
   private String tags = "";


   @Column
   private String pgnstring;
}
