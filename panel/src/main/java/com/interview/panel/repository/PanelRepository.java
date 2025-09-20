package com.interview.panel.repository;

import com.interview.panel.entity.Panel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PanelRepository extends JpaRepository<Panel, Long> {
}
