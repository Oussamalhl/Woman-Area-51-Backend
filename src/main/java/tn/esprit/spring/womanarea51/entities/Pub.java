package tn.esprit.spring.womanarea51.entities;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Pub {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	  private Long id;
	private Timestamp createdate;
	    private String title;
	    private String body;
	    private String image;
	    
	    @ManyToOne
		   private User userpub;
	    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pub")
		 
	    Set<Filepub> filespub;
}
