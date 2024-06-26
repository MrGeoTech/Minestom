package net.minestom.server.network;

/**
 * Represents the current connection state of a {@link net.minestom.server.network.player.PlayerConnection}.
 */
public enum ConnectionState {
    HANDSHAKE, STATUS, LOGIN, CONFIGURATION, PLAY
}
