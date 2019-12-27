package ru.nsu.bayramov.snakegame.model.events;

import java.net.DatagramPacket;
import java.util.List;
import java.util.Map;

import ru.nsu.bayramov.snakegame.model.announcement.IpAddress;
import ru.nsu.bayramov.snakegame.model.SnakesProto.GameMessage.*;
import ru.nsu.bayramov.snakegame.model.SnakesProto.GamePlayer;
import ru.nsu.bayramov.snakegame.model.SnakesProto.GameState.Snake;
import ru.nsu.bayramov.snakegame.model.SnakesProto.GameState.Coord;


public interface EventListener {
    default void update(String eventType, Map<IpAddress, AnnouncementMsg> availableGames) {

    }

    default void update(String eventType, List<Snake> snakes, List<Coord> food, List<GamePlayer> players) {

    }

    default void update(String eventType, DatagramPacket receivedPacket) {

    }

    default void update(String eventType, String message) {

    }

    default void update(String eventType) {

    }
}
