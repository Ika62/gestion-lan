package fr.gestion.lan.controller;

import fr.gestion.lan.entity.Team;
import fr.gestion.lan.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Florian NICOLAS on 03/04/2017.
 */
@RestController
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;


    @RequestMapping(method = RequestMethod.POST, value = "/teams")
    public void createTeam(@RequestBody Team team) {
        team.setId(null);
        teamRepository.save(team);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/teams/{teamId}")
    public void deleteTeam(@PathVariable("teamId") Long teamId) {
        teamRepository.delete(teamId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/teams/{teamId}")
    public void updateTeam(@PathVariable("teamId") Long teamId,
                           @RequestBody Team team) {
        team.setId(teamId);
        teamRepository.save(team);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/teams/{teamId}")
    public Team getTeam(@PathVariable("teamId") Long teamId) {
        return teamRepository.findOneById(teamId).orElse(null);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/teams")
    public List<Team> getTeams() {
        return teamRepository.findAll();
    }


}
