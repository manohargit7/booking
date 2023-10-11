package com.booking.entities;

import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.booking.util.UserOfferId;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;
@Data
@Entity
@Table(name = "user_offers")
@IdClass(UserOfferId.class)
@NoArgsConstructor
public class UserOffer implements Serializable {

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "offer_id", referencedColumnName = "id")
    private Offer offer;
}


