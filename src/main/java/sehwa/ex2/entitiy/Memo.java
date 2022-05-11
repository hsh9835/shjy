package sehwa.ex2.entitiy;

import lombok.*;

import javax.persistence.*;

@Entity
@Table
@ToString
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Memo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mno;

    @Column(length = 200, nullable = false)
    private String memoText;

} // end class
