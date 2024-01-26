package sarahguarneri.BEU2W3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sarahguarneri.BEU2W3.entites.Event;

import java.util.UUID;

@Repository
public interface EventDAO extends JpaRepository<Event, UUID> {
}
