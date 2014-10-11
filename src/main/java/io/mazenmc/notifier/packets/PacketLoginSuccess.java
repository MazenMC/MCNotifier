/*
* Copyright (C) 2014 Mazen K.
* This file is part of MCNotifier.
*
* MCNotifier for Bukkit is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, version 3 to be exact
*
* MCNotifier is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with MCNotifier. If not, see <http://www.gnu.org/licenses/>.
*/

package io.mazenmc.notifier.packets;

import io.mazenmc.notifier.Notifier;

/**
 * Packet which will be notifying the client that they have logged in successfully
 */
public class PacketLoginSuccess extends Packet {

    private static final int id = 1;

    public PacketLoginSuccess(String[] args) {
    }

    @Override
    public void handle() {
        //Empty method
    }

    public static int getID() {
        return id;
    }

    @Override
    public String toString() {
        return Notifier.buildString(id);
    }
}
