package com.example.StartUpSync.service;

import com.example.StartUpSync.entity.TeamUser;
import com.example.StartUpSync.repository.TeamUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TeamUserService implements com.example.StartUpSync.service.interfaces.TeamUserService {
    @Autowired
    private TeamUserRepository teamUserRepository;

    public TeamUser createTeamUser(TeamUser teamUser) {
        return teamUserRepository.save(teamUser);
    }

    public TeamUser findTeamUserById(Long teamUserId) {
        return teamUserRepository.findById(teamUserId).orElse(null);
    }

    public List<TeamUser> findAllTeamUsers() {
        return teamUserRepository.findAll();
    }

    public TeamUser updateTeamUser(TeamUser teamUser) {
        return teamUserRepository.save(teamUser);
    }

    public void deleteTeamUser(Long teamUserId) {
        teamUserRepository.deleteById(teamUserId);
    }
}

