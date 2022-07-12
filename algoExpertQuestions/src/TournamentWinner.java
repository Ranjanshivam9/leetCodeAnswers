import java.util.ArrayList;
import java.util.HashMap;

public class TournamentWinner {
    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        HashMap<String,Integer> scores = new HashMap<>();
        String bestTeam = "bestTeam";
        scores.put(bestTeam,0);

        for(int i = 0; i< competitions.size(); i++){

            ArrayList<String> game = competitions.get(i);

            int result = results.get(i);

            String homeTeam = game.get(0);
            String awayTeam = game.get(1);

            String winningTeam = result == 1 ? homeTeam : awayTeam ;

            if(scores.containsKey(winningTeam)) {
                scores.put(winningTeam,scores.get(winningTeam)+3);
            }else{
                scores.put(winningTeam,3);
            }

            if(scores.get(winningTeam) > scores.get(bestTeam)) {
                bestTeam = winningTeam ;
            }

        }
        return bestTeam;
    }
}
