package edu.tcu.cs.superfrogschedulertdd.repository;

import edu.tcu.cs.superfrogschedulertdd.domain.SuperFrogAppearanceRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SuperFrogAppearanceRequestRepository extends JpaRepository<SuperFrogAppearanceRequest, Integer> {

    List<SuperFrogAppearanceRequest> findByRequestIdIn(List<Integer> appearanceRequestIdList);

}
