package my.own.linkaggregator.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "link")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Link {

    @Id
    @SequenceGenerator(name = "link_id_seq", sequenceName = "link_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "link_id_seq")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "task_id", referencedColumnName = "id", nullable = false)
    @NotNull
    private Task task;

    @Column(nullable = false)
    private String value;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private boolean done;

}
