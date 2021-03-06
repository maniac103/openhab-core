/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.smarthome.magic.binding.handler;

import org.eclipse.smarthome.core.thing.ChannelUID;
import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.thing.ThingStatus;
import org.eclipse.smarthome.core.thing.binding.BaseThingHandler;
import org.eclipse.smarthome.core.types.Command;

/**
 * The {@link MagicDimmableLightHandler} is responsible for handling commands, which are
 * sent to one of the channels.
 *
 * @author Henning Treu - Initial contribution
 */
public class MagicDimmableLightHandler extends BaseThingHandler {

    public MagicDimmableLightHandler(Thing thing) {
        super(thing);
    }

    @Override
    public void handleCommand(ChannelUID channelUID, Command command) {
        // process the command for the brightness channel here
        // if (channelUID.getId().equals(MagicBindingConstants.CHANNEL_BRIGHTNESS)) {
        // }
    }

    @Override
    public void initialize() {
        updateStatus(ThingStatus.ONLINE);
    }
}
