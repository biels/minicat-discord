import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Biel on 27/12/2016.
 */
public class MinicatDiscord extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.broadcastMessage("Minicat-Discord Enabled!");
        super.onEnable();
    }
}
