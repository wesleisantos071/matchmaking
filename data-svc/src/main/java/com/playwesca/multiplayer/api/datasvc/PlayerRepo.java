package com.playwesca.multiplayer.api.datasvc;

import com.playwesca.multiplayer.api.datasvc.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(collectionResourceRel = "player", path = "player")
@Repository
public interface PlayerRepo extends JpaRepository<Player, String> {
}
