package com.evadts.aknesol.evadts;

public class ErrorList {
    String eventCode;
    String eventDescription;
    String eventDefinition;


    public String getEventCode() {
        return eventCode;
    }

    public void setEventCode() {
        this.eventCode = eventCode;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public ErrorList(String eventCode) {
        this.eventCode = eventCode;

        char[] charactersCode = eventCode.toCharArray();
        int firstChar = charactersCode[0];
        int secondChar = charactersCode[1];
        int thirdChar = charactersCode[2];

        switch (firstChar) {
            case 'E':
                switch (secondChar) {
                    //Table 1: COIN MECHANISM
                    case 'A':
                        switch (thirdChar) {
                            case 'A':
                                eventDescription = "Coin Entry Chute ";
                                eventDefinition = "A jam has occurred in the coin entry chute of the machine";
                                break;

                            case 'B':
                                eventDescription = "Reject System or Change Return Cup ";
                                eventDefinition = "A problem has occurred with the payout at the mech/machine interface.";
                                break;

                            case 'C':
                                eventDescription = "Accepting Slugs (Foreign Coins) ";
                                eventDefinition = "EAC Coin mech has detected that a proportion of slugs are being inserted.";
                                break;

                            case 'D':
                                eventDescription = "Jammed Validator ";
                                eventDefinition = "A jam has occurred in the coin recognition part of the coin mech.";
                                break;

                            case 'E':
                                eventDescription = "Jammed Separator ";
                                eventDefinition = "A jam has occurred in the routing mechanism part of the mech.";
                                break;

                            case 'F':
                                eventDescription = "Jammed Dispenser ";
                                eventDefinition = "A jam has occurred in coin payout part of the mech.";
                                break;

                            case 'G':
                                eventDescription = "Jammed Changegiver ";
                                eventDefinition = "A jam has occurred in an indeterminate part of the changer";
                                break;

                            case 'H':
                                eventDescription = "Reject Chute ";
                                eventDefinition = "A jam has occurred in the reject chute under the coin mech.";
                                break;

                            case 'I':
                                eventDescription = "Cash Box";
                                eventDefinition = "A jam has occurred in the entry to the cash box.";
                                break;

                            case 'J':
                                eventDescription = "Price Setting or Programming Error ";
                                eventDefinition = "An error has occurred whilst programming coin mech.";
                                break;

                            case 'K':
                                eventDescription = "Matrix Box Price Line Error ";
                                eventDefinition = "An error has occurred whilst programming matrix box.";
                                break;

                            case 'L':
                                eventDescription = "Failed Validator ";
                                eventDefinition = "A hard fault has occurred in the coin recognition part of the coin mech.";
                                break;

                            case 'M':
                                eventDescription = "Failed Separator ";
                                eventDefinition = "A hard fault has occurred in the routing mechanism part of the mech.";
                                break;

                            case 'N':
                                eventDescription = "Failed Dispenser ";
                                eventDefinition = "A hard fault has occurred in the coin recognition part of the coin mech.";
                                break;

                            case 'O':
                                eventDescription = "Failed Control PCB ";
                                eventDefinition = "Coin mech control PCB has failed.";
                                break;

                            case 'P':
                                eventDescription = "Failed Power Supply ";
                                eventDefinition = "Coin mech power supply has failed.";
                                break;

                            case 'Q':
                                eventDescription = "Credit Display ";
                                eventDefinition = "An error has occurred with coin mech credit display.";
                                break;

                            case 'R':
                                eventDescription = "Comm error ";
                                eventDefinition = "A comms error has occurred between mech and VMC (or peripheral).";
                                break;

                            case 'S':
                                eventDescription = "Coin rejected ";
                                eventDefinition = "Last coin entered has been rejected.";
                                break;

                            case 'U':
                                eventDescription = "MDB error code ";
                                eventDefinition = "The error codes will take the form of EAU_xxyy where the xxyy will indicate the hexidecimal equivalent of the Malfunction Error Code reported by the MDB Coin Mechanism. If the xx = 00 then the yy is the Poll response error code. If the xx is anything else the xxyy is the Extended Diagnostic error code. Example – Malfunction " +
                                        "Error Code 00001100b (Coin Jam) reported. The event code will be: EAU_000C. MDB Error code follows delimiter";
                                break;

                            case '1':
                                eventDescription = "Cassette Removed ";
                                eventDefinition = "The coin storage cassette has been removed unexpectedly.";
                                break;

                            case 'V':
                                eventDescription = "Modifications ";
                                eventDefinition = "Modifications have been made to coin mech setup.";
                                break;

                            case 'W':
                                eventDescription = "No Fault Found ";
                                eventDefinition = "No fault was found with coin mech.";
                                break;

                            case 'X':
                                eventDescription = "Client Induced ";
                                eventDefinition = "Fault occurred caused by client.";
                                break;

                            case 'Y':
                                eventDescription = "Service Induced ";
                                eventDefinition = "Fault occurred caused by serive technician.";
                                break;

                            case 'Z':
                                eventDescription = "Other Unlisted Fault ";
                                eventDefinition = "Fault has occurred which is not listed above.";
                                break;
                        }
                        break;

                    //Table 2: CUP SYSTEM
                    case 'B':
                        switch (thirdChar) {

                            case 'A':
                                eventDescription = "Carousel / Turret Fault";
                                eventDefinition = "Fault on cup Carousel / Turret";
                                break;

                            case 'B':
                                eventDescription = "Stack Empty Switch";
                                eventDefinition = "Fault on cup stack empty switch.";
                                break;

                            case 'C':
                                eventDescription = "Cup Detection Switch / Sensor";
                                eventDefinition = "Fault on cup detection switch / sensor.";
                                break;

                            case 'D':
                                eventDescription = "Splitter ";
                                eventDefinition = "Fault on cup splitting";
                                break;

                            case 'E':
                                eventDescription = "Cup Transfer Fault or Cup Chute";
                                eventDefinition = "Cups failing to arrive in dispense area";
                                break;

                            case 'F':
                                eventDescription = "Cup Ring Fault ";
                                eventDefinition = "Defect cup ring.";
                                break;

                            case 'G':
                                eventDescription = "Faulty Cups ";
                                eventDefinition = "Faulty or wrong cups in dispenser";
                                break;

                            case 'H':
                                eventDescription = "Geneva Wheel ";
                                eventDefinition = "Fault on Geneva Wheel";
                                break;

                            case 'I':
                                eventDescription = "Cup Arm ";
                                eventDefinition = "Fault Cup arm/cup transfer";
                                break;

                            case 'J':
                                eventDescription = "No Cups ";
                                eventDefinition = "No Cups in Carousel / Turret. If multiple cup sizes / turrets used, indicate as EBJ_x where x is equal to size / turrect number (i.e. EBJ_2)";
                                break;

                            case 'K':
                                eventDescription = "Cup Transport ";
                                eventDefinition = "An error has been detected in the cup transport, e.g. elevator, conveyor belt, etc.";
                                break;

                            case 'M':
                                eventDescription = "Cup Drop Motor/Solenoid";
                                eventDefinition = "Faulty motor / solenoid used for dispensing cups.";
                                break;

                            case 'N':
                                eventDescription = "Cup Index Motor  ";
                                eventDefinition = "Fault on motor used for replenishing cup stack";
                                break;

                            case 'V':
                                eventDescription = "Modifications ";
                                eventDefinition = "Modifications has been made to cup mechanism";
                                break;

                            case 'W':
                                eventDescription = "No Fault Found  ";
                                eventDefinition = "No fault found on cup mechanism";
                                break;

                            case 'X':
                                eventDescription = "Client Induced ";
                                eventDefinition = "Client induced cup mechanism fault.";
                                break;

                            case 'Y':
                                eventDescription = "Service Induced ";
                                eventDefinition = "Service induced cup mechanism fault.";
                                break;

                            case 'Z':
                                eventDescription = "Other Unlisted Fault";
                                eventDefinition = "Other undefined cup mechanism fault.";
                                break;
                        }
                        break;


                    //Table 3: CONTROL SYSTEM
                    case 'C':
                        switch (thirdChar) {
                            case 'A':
                                eventDescription = "Power Supply ";
                                eventDefinition = "One or more of the power supplies are indicating an under or over voltage situation.";
                                break;

                            case 'B':
                                eventDescription = "Fuses / Overload Switches  ";
                                eventDefinition = "One or more of the fuses / overload switches has tripped.";
                                break;

                            case 'C':
                                eventDescription = "Transformer  ";
                                eventDefinition = "One or more of the transformers are indicating an under or over voltage situation.";
                                break;

                            case 'D':
                                eventDescription = "Control PCB ";
                                eventDefinition = "A malfunction has been detected in the control board.";
                                break;

                            case 'E':
                                eventDescription = "Relay PCB/Interface PCB ";
                                eventDefinition = "A malfunction has been detected in the Relay / Interface board.";
                                break;

                            case 'F':
                                eventDescription = "Loom/Harness Connection Fault ";
                                eventDefinition = "A malfunction has been detected in a loom (cable) and/or a connection.";
                                break;

                            case 'G':
                                eventDescription = "Timer Cams ";
                                eventDefinition = "A malfunction has been detected in one or more of the timer cams.";
                                break;

                            case 'H':
                                eventDescription = "Opto Sensor ";
                                eventDefinition = "A malfunction has been detected in one or more of the opto sensors.";
                                break;

                            case 'I':
                                eventDescription = "Door Switch ";
                                eventDefinition = "The door switch is stuck open or closed.";
                                break;

                            case 'J':
                                eventDescription = "Microswitch ";
                                eventDefinition = "A malfunction has been detected in one or more of the micro switches.";
                                break;

                            case 'K':
                                eventDescription = "Ancillary Elec. item ";
                                eventDefinition = "A malfunction has been detected in one or more of the ancillary electrical items.";
                                break;

                            case 'L':
                                eventDescription = "Time Clocks ";
                                eventDefinition = "A malfunction has been detected in the time clock.";
                                break;

                            case 'M':
                                eventDescription = "Program Memory Error ";
                                eventDefinition = "An error has been detected in the program memory e.g. EPROM or FLASH.";
                                break;

                            case 'N':
                                eventDescription = "RAM Error ";
                                eventDefinition = "An error has been detected in the RAM.";
                                break;

                            case 'O':
                                eventDescription = "Non Volatile Memory Error ";
                                eventDefinition = "An error has been detected in the non volatile memory.";
                                break;

                            case 'P':
                                eventDescription = "Job Queue Full ";
                                eventDefinition = "The job queue has overrun.";
                                break;

                            case 'Q':
                                eventDescription = "Output Driver Fail ";
                                eventDefinition = "An error has been detected in an output driver.";
                                break;

                            case 'R':
                                eventDescription = "Excessive CPU Resets ";
                                eventDefinition = "Excessive CPU resets have been detected.";
                                break;

                            case 'S':
                                eventDescription = "Display PCB ";
                                eventDefinition = "A malfunction has been detected in the selection display PCB. If the display board is combined with another PCB function (e.g. selection buttons) this is the code that should prevail.";
                                break;

                            case 'T':
                                eventDescription = "Relay ";
                                eventDefinition = "A malfunction has been detected in one or more of the relays.";
                                break;

                            case 'U':
                                eventDescription = "Battery ";
                                eventDefinition = "The backup battery is low, missing, or not charging.";
                                break;

                            case '1':
                                switch (charactersCode[3]) {

                                    case 'A':
                                        eventDescription = "Electrical Safety ";
                                        eventDefinition = "The electrical safety is of concern.";
                                        break;

                                    case 'B':
                                        eventDescription = "Selection Panel/switch/mechanism";
                                        eventDefinition = "A malfunction has been detected in the selection panel/switch/mechanism.";
                                        break;

                                    case 'C':
                                        eventDescription = "Temperature Sensor Error ";
                                        eventDefinition = "Temperature sensor is defective, disconnected or reading is out of range";
                                        break;

                                    case 'D':
                                        eventDescription = "No Printer Paper ";
                                        eventDefinition = "The printer in out of paper.";
                                        break;

                                    case 'E':
                                        eventDescription = "Vend Counter ";
                                        eventDefinition = "A malfunction has been detected in the vend counter.";
                                        break;

                                    case 'F':
                                        eventDescription = "Selection PCB ";
                                        eventDefinition = "A malfunction has been detected in the selection board.";
                                        break;

                                    case 'G':
                                        eventDescription = "Product Delivery PCB";
                                        eventDefinition = "A malfunction has been detected in the product delivery board.";
                                        break;
                                }
                                break;
                            case 'V':
                                eventDescription = "Modifications ";
                                eventDefinition = "Modifications has been made to control system";
                                break;

                            case 'W':
                                eventDescription = "No Fault Found ";
                                eventDefinition = "No fault found on control system";
                                break;

                            case 'X':
                                eventDescription = "Client Induced ";
                                eventDefinition = "Client induced control system fault.";
                                break;

                            case 'Y':
                                eventDescription = "Service Induced ";
                                eventDefinition = "Service induced control system fault.";
                                break;

                            case 'Z':
                                eventDescription = "Other Unlisted Fault";
                                eventDefinition = "Other undefined control system fault.";
                                break;
                        }
                        break;


                    //Table 4: HOT DRINKS SYSTEM
                    case 'D':
                        switch (thirdChar) {
                            case 'A':
                                eventDescription = "Canister ";
                                eventDefinition = "One of the ingredient canisters is faulty";
                                break;

                            case 'B':
                                eventDescription = "Auger/Spiral Mechanism  ";
                                eventDefinition = "Fault on ingredient dispense mechanism";
                                break;

                            case 'C':
                                eventDescription = "Ingredient Throw ";
                                eventDefinition = "Incorrect ingredient throw.";
                                break;

                            case 'D':
                                eventDescription = "Whipper Motor ";
                                eventDefinition = "Fault on ingredients whipper (mixer) motor.";
                                break;

                            case 'E':
                                eventDescription = "Whipper Chamber ";
                                eventDefinition = "Faulty ingredients (mixer) whipper chamber";
                                break;

                            case 'F':
                                eventDescription = "Delivery Pipes & Mixing Bowls ";
                                eventDefinition = "Faulty delivery pipes and/or mixing bowl";
                                break;

                            case 'H':
                                eventDescription = "Ingredient Nozzle ";
                                eventDefinition = "Faulty ingredient";
                                break;

                            case 'I':
                                eventDescription = "Ingredient Coil ";
                                eventDefinition = "Fault on Dosing solenoid";
                                break;

                            case 'J':
                                eventDescription = "Ingredients Empty ";
                                eventDefinition = "One or more of the ingredient canisters is empty";
                                break;

                            case 'K':
                                eventDescription = "Water Heater Tank ";
                                eventDefinition = "Fault on boiler (water heater tank)";
                                break;

                            case 'L':
                                eventDescription = "Heater Fuse ";
                                eventDefinition = "The boiler (heater element) fuse is blown.";
                                break;

                            case 'M':
                                eventDescription = "Thermostat ";
                                eventDefinition = "Faulty boiler control thermostat";
                                break;

                            case 'N':
                                eventDescription = "H.T. Cut Out ";
                                eventDefinition = "Cut out operated because of an overboil situation.";
                                break;

                            case 'O':
                                eventDescription = "Boiler Scale ";
                                eventDefinition = "Scale in the boiler.";
                                break;

                            case 'P':
                                eventDescription = "Level Control ";
                                eventDefinition = "Water Level control in the heater tank faulty";
                                break;

                            case 'Q':
                                eventDescription = "Overflow Pipe ";
                                eventDefinition = "Fault on overflow pipe or detected from water tank.";
                                break;

                            case 'R':
                                eventDescription = "Element Seal ";
                                eventDefinition = "The heater element seal is defect.";
                                break;

                            case 'S':
                                eventDescription = "Boiler Shell ";
                                eventDefinition = "The heater tank is damaged";
                                break;

                            case 'T':
                                eventDescription = "Grinder ";
                                eventDefinition = "Fault on grinder";
                                break;

                            case 'U':
                                eventDescription = "Coffee Doser ";
                                eventDefinition = "Volumetric Coffee doser faulty";
                                break;

                            case '1':
                                eventDescription = "Dispense Head ";
                                eventDefinition = "Fault on dispense head";
                                break;

                            case 'V':
                                eventDescription = "Modifications ";
                                eventDefinition = "Modifications made to Hot Drinks System";
                                break;

                            case 'W':
                                eventDescription = "No Fault Found ";
                                eventDefinition = "No Hot Drinks System fault could be found.";
                                break;

                            case 'X':
                                eventDescription = "Client Induced ";
                                eventDefinition = "Client induced Hot Drinks System fault.";
                                break;

                            case 'Y':
                                eventDescription = "Service Induced ";
                                eventDefinition = "Service induced Hot Drinks System fault.";
                                break;

                            case 'Z':
                                eventDescription = "Other Unlisted Fault ";
                                eventDefinition = "Other undefined Hot Drinks System fault.";
                                break;
                        }
                        break;
                    //Table 5: BREWER/ESPRESSO UNIT
                    case 'E':
                        switch (thirdChar) {
                            case 'A':
                                eventDescription = "Brewer Motor ";
                                eventDefinition = "Fault on Motor for brewer";
                                break;

                            case 'B':
                                eventDescription = "Scraper Motor ";
                                eventDefinition = "Fault on Motor for brewer scraper";
                                break;

                            case 'C':
                                eventDescription = "Filter Plate ";
                                eventDefinition = "Filter plate blocked or changed or cleaned.";
                                break;

                            case 'D':
                                eventDescription = "Filter Paper ";
                                eventDefinition = "No filter paper or faulty filter paper.";
                                break;

                            case 'E':
                                eventDescription = "Scraper Arm ";
                                eventDefinition = "Fault on brewer scraper arm.";
                                break;

                            case 'F':
                                eventDescription = "Brew Chamber ";
                                eventDefinition = "Damaged brew chamber.";
                                break;

                            case 'G':
                                eventDescription = "Piston ";
                                eventDefinition = "Damaged piston in brewer";
                                break;

                            case 'H':
                                eventDescription = "Timer ";
                                eventDefinition = "Fault in Timer unit for Brewer/Espresso unit";
                                break;

                            case 'I':
                                eventDescription = "PCB ";
                                eventDefinition = "Fault on PCB for brewer/espresso unit";
                                break;

                            case 'J':
                                eventDescription = "Scraper Switch ";
                                eventDefinition = "Faulty scraper switch.";
                                break;

                            case 'K':
                                eventDescription = "Drive Mechanism ";
                                eventDefinition = "Fault on drive mechanism for Brewer/Espresso unit.";
                                break;

                            case 'L':
                                eventDescription = "Seals ";
                                eventDefinition = "Leakage in brewer/espresso unit.";
                                break;

                            case 'V':
                                eventDescription = "Modifications ";
                                eventDefinition = "Modification made to Brewer/Espresso Unit";
                                break;

                            case 'W':
                                eventDescription = "No Fault Found ";
                                eventDefinition = "No Brewer/Espresso Unit fault could be found.";
                                break;

                            case 'X':
                                eventDescription = "Client Induced ";
                                eventDefinition = "Client induced Brewer/Espresso Unit fault.";
                                break;

                            case 'Y':
                                eventDescription = "Service Induced ";
                                eventDefinition = "Service induced Brewer/Espresso Unit fault.";
                                break;

                            case 'Z':
                                eventDescription = "Other Unlisted Fault ";
                                eventDefinition = "Other undefined Brewer/Espresso Unit fault.";
                                break;
                        }
                        break;

                    //Table 6: WATER SYSTEM
                    case 'F':
                        switch (thirdChar) {
                            case 'A':
                                eventDescription = "Inlet Pipe ";
                                eventDefinition = "Fault on water connecting hose";
                                break;

                            case 'B':
                                eventDescription = "Water Filter ";
                                eventDefinition = "Water needs to be changed/has been changed.";
                                break;

                            case 'C':
                                eventDescription = "Inlet Valve ";
                                eventDefinition = "Faulty Inlet valve";
                                break;

                            case 'D':
                                eventDescription = "Non-return Valve Delivery Valve  ";
                                eventDefinition = "Fault on non-return.";
                                break;

                            case 'E':
                                eventDescription = "Regulator ";
                                eventDefinition = "Faulty Water pressure regulator";
                                break;

                            case 'F':
                                eventDescription = "Tank ";
                                eventDefinition = "Header tank fault";
                                break;

                            case 'G':
                                eventDescription = "Float System ";
                                eventDefinition = "Error in the water level detection system.";
                                break;

                            case 'H':
                                eventDescription = "Vend Valve ";
                                eventDefinition = "Faulty dispense valve";
                                break;

                            case 'I':
                                eventDescription = "Vend Valve Scale ";
                                eventDefinition = "Valve needs descaling or has been descaled";
                                break;

                            case 'J':
                                eventDescription = "Hose / Joint Leak ";
                                eventDefinition = "Water leakage in hose or joint.";
                                break;

                            case 'K':
                                eventDescription = "Probes/holder ";
                                eventDefinition = "Fault on water level probe assembly";
                                break;

                            case 'L':
                                eventDescription = "Water Supply Failure ";
                                eventDefinition = "No water (could be too low water pressure)";
                                break;

                            case 'M':
                                eventDescription = "Manifold ";
                                eventDefinition = "Fault on water delivery Manifold or Branch pipe";
                                break;

                            case 'N':
                                eventDescription = "Water Pump ";
                                eventDefinition = "Faulty water pump head";
                                break;

                            case 'O':
                                eventDescription = "Pump Motor ";
                                eventDefinition = "Faulty water pump motor";
                                break;

                            case 'P':
                                eventDescription = "Water Quality ";
                                eventDefinition = "Water quality issue reported";
                                break;

                            case 'V':
                                eventDescription = "Modifications ";
                                eventDefinition = "Modifications made to the Water System";
                                break;

                            case 'W':
                                eventDescription = "No Fault Found ";
                                eventDefinition = "No Water System fault could be found.";
                                break;

                            case 'X':
                                eventDescription = "Client Induced ";
                                eventDefinition = "Client induced Water System fault.";
                                break;

                            case 'Y':
                                eventDescription = "Service Induced ";
                                eventDefinition = "Service induced Water System fault.";
                                break;

                            case 'Z':
                                eventDescription = "Other Unlisted Fault ";
                                eventDefinition = "Other undefined Water System fault.";
                                break;
                        }
                        break;

                    //Table 7: CABINET/DOOR
                    case 'G':
                        switch (thirdChar) {

                            case 'A':
                                eventDescription = "Cabinet ";
                                eventDefinition = " Damage / Fault on cabnet / frame.";
                                break;

                            case 'B':
                                eventDescription = "Legs ";
                                eventDefinition = " Missing / Damage to machine legs.";
                                break;

                            case 'C':
                                eventDescription = "Door / Lock ";
                                eventDefinition = " Faulty lock / door latching mechanism.";
                                break;

                            case 'D':
                                eventDescription = "Decals / Labels  ";
                                eventDefinition = " Damage or wrong decals or labels.";
                                break;

                            case 'E':
                                eventDescription = "Lighting Fault";
                                eventDefinition = " Lamps or ballast not working.";
                                break;

                            case 'F':
                                eventDescription = "Facia / Trim ";
                                eventDefinition = " Damaged or missing trim.";
                                break;

                            case 'K':
                                eventDescription = "Selection Lock / Latch";
                                eventDefinition = " dsdsdsd";
                                break;

                            case 'L':
                                eventDescription = "Indicator ";
                                eventDefinition = " unknown";
                                break;

                            case 'M':
                                eventDescription = "Drip Tray Assembly ";
                                eventDefinition = " Drip tray not in place.";
                                break;

                            case 'N':
                                eventDescription = "Waste Full ";
                                eventDefinition = " If required specify waste container number, i.e.  EGN_2";
                                break;

                            case 'P':
                                eventDescription = "Extract Fan / Impellor ";
                                eventDefinition = " Extract fan not working.";
                                break;

                            case 'Q':
                                eventDescription = "Extract Duct ";
                                eventDefinition = " Extract duct not in place or blocked.";
                                break;

                            case 'R':
                                eventDescription = "Extract Motor ";
                                eventDefinition = " Fault detected on extract motor.";
                                break;

                            case 'S':
                                eventDescription = "Door Open ";
                                eventDefinition = " State of door is open.";
                                break;

                            case 'T':
                                eventDescription = "Door Closed ";
                                eventDefinition = " State of door is closed.";
                                break;

                            case 'U':
                                eventDescription = "Vend Door";
                                eventDefinition = " Fault on the product delivery/vend door. This may include a solenoid, motor, mechanical binding, or inability to reach the desired position. This includes side moving doors and other internal doors but excludes the delivery assembly door at the bottom of a snack machine (see EJG).";
                                break;

                            case 'V':
                                eventDescription = "Modifications ";
                                eventDefinition = " Modifications have been made.";
                                break;

                            case 'W':
                                eventDescription = "No Fault Found ";
                                eventDefinition = " No fault was found";
                                break;

                            case 'X':
                                eventDescription = "Client Induced ";
                                eventDefinition = " Fault occurred caused by client.";
                                break;

                            case 'Y':
                                eventDescription = "Service Induced ";
                                eventDefinition = " Fault occurred caused by service technician.";
                                break;

                            case 'Z':
                                eventDescription = "Other Unlisted Fault ";
                                eventDefinition = " Fault has occurred which is not listed above.";
                                break;

                        }
                        break;
                    //Table 8: COLD DRINK DISPENSING SYSTEM
                    case 'H':
                        switch (thirdChar) {
                            case 'C':
                                eventDescription = "Carbonator Tank ";
                                eventDefinition = "Leaking, defective or is not being filled to the proper level ";
                                break;

                            case 'F':
                                eventDescription = "Syrup Pump ";
                                eventDefinition = "Defective or clogged syrup pump";
                                break;

                            case 'G':
                                eventDescription = "Syrup Valve ";
                                eventDefinition = "Defective or clogged syrup value";
                                break;

                            case 'H':
                                eventDescription = "Syrup Pipe ";
                                eventDefinition = "Defective or clogged syrup pipe";
                                break;

                            case 'I':
                                eventDescription = "Syrup Canister Container ";
                                eventDefinition = "Container is out of syrup or defecrtive.";
                                break;

                            case 'J':
                                eventDescription = "Syrup O Ring/Seal ";
                                eventDefinition = "Defective or leaking";
                                break;

                            case 'K':
                                eventDescription = "CO2 Bottle ";
                                eventDefinition = "CO2 pressure is low or empty. Defective CO2 Bottle";
                                break;

                            case 'L':
                                eventDescription = "CO2 Regulator/Adjust CO2 ";
                                eventDefinition = "CO2 pressure level is outside of acceptable range. Adjust or replace regulator.";
                                break;

                            case 'M':
                                eventDescription = "CO2 / Water Leak ";
                                eventDefinition = "CO2 or water is leaking";
                                break;

                            case 'N':
                                eventDescription = "CO2 Pipe ";
                                eventDefinition = "Defective or clogged CO2 pipe";
                                break;

                            case 'O':
                                eventDescription = "CO2 Gauge ";
                                eventDefinition = "Pressure indication is not correct";
                                break;

                            case 'P':
                                eventDescription = "CO2 Gauge O Ring ";
                                eventDefinition = "O ring defective";
                                break;

                            case 'T':
                                eventDescription = "Ice/Water Bath ";
                                eventDefinition = "Bath is too warm or has frozen";
                                break;

                            case 'U':
                                eventDescription = "Bath Agitator Motor ";
                                eventDefinition = "Motor has failed";
                                break;
                            case '1':
                                switch (charactersCode[3]) {
                                    case 'A':
                                        eventDescription = "Bath Cold Thermostat ";
                                        eventDefinition = "Defective thermostat";
                                        break;

                                    case 'B':
                                        eventDescription = "Bath Level Control ";
                                        eventDefinition = "Water level in the bath is too low";
                                        break;

                                    case 'C':
                                        eventDescription = "Carbonator Water Pump ";
                                        eventDefinition = "Defective pump";
                                        break;

                                    case 'K':
                                        eventDescription = "Ice Maker door solenoid ";
                                        eventDefinition = "Ice Maker door solenoid";
                                        break;

                                    case 'L':
                                        eventDescription = "Ice Maker level switch ";
                                        eventDefinition = "Defective switch";
                                        break;

                                    case 'M':
                                        eventDescription = "Ice Maker auger motor ";
                                        eventDefinition = "Defective or jammed. Frozen ice may be preventing auger operation.";
                                        break;

                                    case 'N':
                                        eventDescription = "Carbonator value ";
                                        eventDefinition = "Value is clogged or Defective";
                                        break;

                                    case 'O':
                                        eventDescription = "Carbonator level sensors";
                                        eventDefinition = "Defective, may be indicating both ligh and low levet at the same time";
                                        break;

                                    case 'P':
                                        eventDescription = "Feeder Cup level sensors";
                                        eventDefinition = "Defective, may be indicating both high and low level at the same time";
                                        break;

                                    case 'Q':
                                        eventDescription = "Feeder Cup empty ";
                                        eventDefinition = "The feeder cup has less than the required minimum amount of water in it.";
                                        break;

                                    case 'R':
                                        eventDescription = "Water path cleaning system ";
                                        eventDefinition = "The cleaning system is defective";
                                        break;
                                }
                                break;
                            case 'V':
                                eventDescription = "Modifications ";
                                eventDefinition = "Modifications have been made.";
                                break;

                            case 'W':
                                eventDescription = "No Fault Found ";
                                eventDefinition = "No fault was found.";
                                break;

                            case 'X':
                                eventDescription = "Client Induced ";
                                eventDefinition = "Fault occurred caused by client.";
                                break;

                            case 'Y':
                                eventDescription = "Service Induced ";
                                eventDefinition = "Fault occurred caused by service technician.";
                                break;

                            case 'Z':
                                eventDescription = "Other Unlisted Fault";
                                eventDefinition = "Fault has occurred which is not listed above";
                                break;

                        }
                        break;
                    //Table 9: COMMUNICATIONS
                    case 'I':
                        switch (thirdChar) {

                            case 'A':
                                eventDescription = "No Modem / Radio Facility ";
                                eventDefinition = "No modem / radio detected in system.";
                                break;

                            case 'B':
                                eventDescription = "Telephone Line Failure ";
                                eventDefinition = "Modem has detected that the telephone line is not working (e.g. no dial tone).";
                                break;

                            case 'C':
                                eventDescription = "Low Comms Battery ";
                                eventDefinition = "The Comms Gateway’s battery, or back-up power source, is low and in risk of going flat.";
                                break;

                            case 'D':
                                eventDescription = "Remote Machine Comms Error ";
                                eventDefinition = "The remote host had a communications error, e.g. not synchronizing, continuous dropped call, etc.";
                                break;

                            case 'E':
                                eventDescription = "No WAN Coverage ";
                                eventDefinition = "No WAN network detected. If WAN is a wireless network then Comms Gateway is out of coverage or there is an antenna problem.";
                                break;

                            case 'F':
                                eventDescription = "No LAN Coverage ";
                                eventDefinition = "No LAN network detected. If LAN is a wireless network then Audit Unit is out of coverage, is not properly configured to communicate with the network, or has an antenna problem.";
                                break;

                            case 'G':
                                eventDescription = "Remote Host Busy ";
                                eventDefinition = "The remote host is busy, communication could not be established.";
                                break;

                            case 'H':
                                eventDescription = "Communication Denied by Network";
                                eventDefinition = "Comms Gateway is in coverage but the network is not allowing unit to perform transmissions (e.g. unit is not registered with network provider, address collissions on a LAN, etc.).";
                                break;

                            case 'I':
                                eventDescription = "Communication Denied by Remote Host";
                                eventDefinition = "Remote host is reachable through the network but is denying communications with the Comms Gateway.";
                                break;

                            case 'J':
                                eventDescription = "Comms Gateway Not Commissioned";
                                eventDefinition = "Comms Gateway has not been registered (commissioned) with the remote host.";
                                break;

                            case 'K':
                                eventDescription = "Communication Reliability Low ";
                                eventDefinition = "Successful transmissions (from Comms Gateway to remote host) have fallen below 80% of total transmission attempts over the last 30 days.";
                                break;

                            case 'L':
                                eventDescription = "VMC Not Responding ";
                                eventDefinition = "The Comms Gateway reported it can not establish a data transfer session with the VMC.";
                                break;

                            case 'M':
                                eventDescription = "No VMC Data Transfer Port ";
                                eventDefinition = "The Comms Gateway reported it does not sense the presence of a connection to the VMC’s data transfer port.";
                                break;

                            case 'N':
                                eventDescription = "Weak Radio Signal Strenght Indicator";
                                eventDefinition = "The Comms Gateway can detect a network signal, but it is below an optional level for reliable communications. This level is set by the communications technology.";
                                break;

                            case 'O':
                                eventDescription = "Comms Gateway to VMC communication error";
                                eventDefinition = "The VMC reported a communication error has occurred between VMC and the Comms Gateway.";
                                break;

                            case 'V':
                                eventDescription = "Modifications ";
                                eventDefinition = "Modifications have been made.";
                                break;

                            case 'W':
                                eventDescription = "No Fault Found ";
                                eventDefinition = "No fault was found.";
                                break;

                            case 'X':
                                eventDescription = "Client Induced ";
                                eventDefinition = "Fault occurred caused by client.";
                                break;

                            case 'Y':
                                eventDescription = "Service Induced ";
                                eventDefinition = "Fault occurred caused by service technician.";
                                break;

                            case 'Z':
                                eventDescription = "Other Unlisted Fault ";
                                eventDefinition = "Fault has occurred which is not listed above.";
                                break;
                        }
                        break;
                    //Table 10: FOOD, SNACK, OR CAN/BOTTLE SYSTEM
                    case 'J':
                        switch (thirdChar) {
                            case 'A':
                                eventDescription = "Vend Door Error ";
                                eventDefinition = "Not for new designs, see Table 7, EGU. A door error exists: This may include a solenoid, motor problem, mechanical binding, or not able to reach the desired position. This includes side moving doors and other internal doors but excludes the delivery assembly door at the bottom of a snack machine. ";
                                break;
                            case 'B':
                                eventDescription = "Dispense Motor ";
                                eventDefinition = "Errors exist on a product dispense motor which may include motor jammed, motor not home, coupling error, defective motor, or wiring error.";
                                break;

                            case 'C':
                                eventDescription = "Candy/Chain/Heli x Assembly. ";
                                eventDefinition = "Helix/chain is blocked or helix is not inserted proper.";
                                break;

                            case 'D':
                                eventDescription = "Shelves / Drawers / Trays ";
                                eventDefinition = "One of the shelves is not properly connected/inserted. Shelf is not installed properly, or is defective.";
                                break;

                            case 'E':
                                eventDescription = "Drum Mechanism (Food)";
                                eventDefinition = "The drum mechanism does not turn correctly.";
                                break;

                            case 'F':
                                eventDescription = "Drum Motor (Food) ";
                                eventDefinition = "The motor driving the drum is defective.";
                                break;

                            case 'G':
                                eventDescription = "Delivery / Door Assembly ";
                                eventDefinition = "The delivery/door assembly is not operating properly. This is typically the area at the bottom of a snack machine where the customer reaches inside to get the product.";
                                break;

                            case 'H':
                                eventDescription = "Health Timer ";
                                eventDefinition = "The Health rules have been violated for the temperature controlled section. Dependant upon the regional rules, the food section may be Out of Service (food may not be served)";
                                break;

                            case 'I':
                                eventDescription = "Fans ";
                                eventDefinition = "One of the fans is defective.";
                                break;

                            case 'J':
                                eventDescription = "Refrigeration ";
                                eventDefinition = "The cooling unit does not cool down to the pre-set temperature or the unit has frozen up";
                                break;

                            case 'K':
                                eventDescription = "Thermostat ";
                                eventDefinition = "The Thermostat is defective.";
                                break;

                            case 'L':
                                eventDescription = "Product delivery detector error ";
                                eventDefinition = "The product delivery detection system has an error.";
                                break;

                            case 'M':
                                eventDescription = "Product Delivery System ";
                                eventDefinition = "An error has been detected in the product delivery system, e.g. elevator, arm, conveyor belt, etc.";
                                break;

                            case 'V':
                                eventDescription = "Modifications ";
                                eventDefinition = "Modifications have been initialized at the machine.";
                                break;

                            case 'W':
                                eventDescription = "No Fault Found ";
                                eventDefinition = "Machine was inspected but no fault found.";
                                break;

                            case 'X':
                                eventDescription = "Client Induced ";
                                eventDefinition = "Fault was induced by a client due to vandalism or fraud.";
                                break;

                            case 'Y':
                                eventDescription = "Service Induced ";
                                eventDefinition = "A service is necessary.";
                                break;

                            case 'Z':
                                eventDescription = "Other Unlisted Fault ";
                                eventDefinition = "All non-specialized faults that are not covered by the above list.";
                                break;

                        }
                        break;

                    case 'K':
                        //TABLE 11a: CASHLESS 2 SYSTEMS

                        if (charactersCode[2] == '2') {
                            switch (charactersCode[3]) {

                                case 'A':
                                    eventDescription = "Card Reader ";
                                    eventDefinition = "Cashless System contacting unit defective";
                                    break;

                                case 'B':
                                    eventDescription = "Control Unit  ";
                                    eventDefinition = "Error on card reader control unit detected";
                                    break;

                                case 'C':
                                    eventDescription = "Control PCB ";
                                    eventDefinition = "Cashless System control PCB has failed.";
                                    break;

                                case 'D':
                                    eventDescription = "Failed Power Supply ";
                                    eventDefinition = "Cashless System power supply has failed.";
                                    break;

                                case 'E':
                                    eventDescription = "Card Rejected ";
                                    eventDefinition = "Card rejected because of error (see details below)";
                                    break;

                                case 'F':
                                    eventDescription = "Programming ";
                                    eventDefinition = "Cashless System parameter programming incorrect";
                                    break;

                                case 'G':
                                    eventDescription = "Card not programmed ";
                                    eventDefinition = "Card not yet ready programmed for use";
                                    break;

                                case 'H':
                                    eventDescription = "Card expired ";
                                    eventDefinition = "Card validation date has expired";
                                    break;

                                case 'I':
                                    eventDescription = "Card blocked ";
                                    eventDefinition = "Card is blocked due to errors or corruption";
                                    break;

                                case 'J':
                                    eventDescription = "Card rejected, marked in hotlist ";
                                    eventDefinition = "Card number is in hot list";
                                    break;

                                case 'K':
                                    eventDescription = "Memory full, read-out data ";
                                    eventDefinition = "Transaction memory capacity expired";
                                    break;

                                case 'L':
                                    eventDescription = "Security module (SIM-Card) ";
                                    eventDefinition = "SIM card defective or not valid any more";
                                    break;

                                case 'M':
                                    eventDescription = "Comm error ";
                                    eventDefinition = "A communication error has been detected and / or all communications has stopped.";
                                    break;

                                case 'U':
                                    eventDescription = "MDB Error Code ";
                                    eventDefinition = "The error codes will take the form of EK2U_xx where the xx will indicate the hexidecimal equivalent of the Malfunction Error Code reported by the MDB Cashless System. Example – Malfunction Error Code 0100yyyyb (Communications Error) reported, the data in yyyy is the manufacture defined subcode and will vary. The event code will be: EK2U_4X.";
                                    break;

                                case 'V':
                                    eventDescription = "Modifications ";
                                    eventDefinition = "Modifications have been made.";
                                    break;

                                case 'W':
                                    eventDescription = "No Fault Found ";
                                    eventDefinition = "No fault was found with Cashless 1 System";
                                    break;

                                case 'X':
                                    eventDescription = "Client Induced ";
                                    eventDefinition = "Fault occurred caused by client.";
                                    break;

                                case 'Y':
                                    eventDescription = "Service Induced ";
                                    eventDefinition = "Fault occurred caused by service technician.";
                                    break;

                                case 'Z':
                                    eventDescription = "Other Unlisted Fault ";
                                    eventDefinition = "Fault has occurred which is not listed above";
                                    break;
                            }
                            break;

                        } else {
                            //Table 11: CASHLESS 1 SYSTEM
                            switch (thirdChar) {
                                case 'A':
                                    eventDescription = "Card Reader ";
                                    eventDefinition = "Cashless System contacting unit defective";
                                    break;

                                case 'B':
                                    eventDescription = "Control Unit  ";
                                    eventDefinition = "Error on card reader control unit detected";
                                    break;

                                case 'C':
                                    eventDescription = "Control PCB ";
                                    eventDefinition = "Cashless System control PCB has failed.";
                                    break;

                                case 'D':
                                    eventDescription = "Failed Power Supply ";
                                    eventDefinition = "Cashless System power supply has failed.";
                                    break;

                                case 'E':
                                    eventDescription = "Card Rejected ";
                                    eventDefinition = "Card rejected because of error (see details below)";
                                    break;

                                case 'F':
                                    eventDescription = "Programming ";
                                    eventDefinition = "Cashless System parameter programming incorrect";
                                    break;

                                case 'G':
                                    eventDescription = "Card not programmed ";
                                    eventDefinition = "Card not yet ready programmed for use";
                                    break;

                                case 'H':
                                    eventDescription = "Card expired ";
                                    eventDefinition = "Card validation date has expired";
                                    break;

                                case 'I':
                                    eventDescription = "Card blocked ";
                                    eventDefinition = "Card is blocked due to errors or corruption";
                                    break;

                                case 'J':
                                    eventDescription = "Card rejected, marked in hotlist ";
                                    eventDefinition = "Card number is in hot list";
                                    break;

                                case 'K':
                                    eventDescription = "Memory full, read-out data ";
                                    eventDefinition = "Transaction memory capacity expired";
                                    break;

                                case 'L':
                                    eventDescription = "Security module (SIM-Card) ";
                                    eventDefinition = "SIM card defective or not valid any more";
                                    break;

                                case 'M':
                                    eventDescription = "Comm error ";
                                    eventDefinition = "A communication error has been detected and / or all communications has stopped.";
                                    break;

                                case 'U':
                                    eventDescription = "MDB Error Code ";
                                    eventDefinition = "The error codes will take the form of  EKU_xx where the xx will indicate the hexidecimal equivalent of the Malfunction Error Code reported by the MDB Cashless System. Example – Malfunction Error Code 0100yyyyb (Communications Error) reported, the data in yyyy is the manufacture defined subcode and will vary. The event code will be: EKU_4X.";
                                    break;

                                case 'V':
                                    eventDescription = "Modifications ";
                                    eventDefinition = "Modifications have been made.";
                                    break;

                                case 'W':
                                    eventDescription = "No Fault Found ";
                                    eventDefinition = "No fault was found with Cashless 1 System";
                                    break;

                                case 'X':
                                    eventDescription = "Client Induced ";
                                    eventDefinition = "Fault occurred caused by client.";
                                    break;

                                case 'Y':
                                    eventDescription = "Service Induced ";
                                    eventDefinition = "Fault occurred caused by service technician.";
                                    break;

                                case 'Z':
                                    eventDescription = "Other Unlisted Fault ";
                                    eventDefinition = "Fault has occurred which is not listed above";
                                    break;

                            }
                            break;
                        }
                        //Table 12: PRODUCT
                    case 'L':
                        switch (thirdChar) {
                            case 'A':
                                eventDescription = "Product Delivery Failure ";
                                eventDefinition = "Vending Machine failed to dispense the choosen product. If required specify product No.(x): ELA_x";
                                break;

                            case 'B':
                                eventDescription = "Product Sold Out Unexpectedly";
                                eventDefinition = "No choosen product left. If required specify product No.(x): ELB_x";
                                break;

                            case 'C':
                                eventDescription = "Water Dispense Quantity ";
                                eventDefinition = "Dispensed quantity exceeds preset range. If required specify product No.(x): ELC_x";
                                break;

                            case 'D':
                                eventDescription = "Syrup Dispense Quantity ";
                                eventDefinition = "Dispensed quantity exceeds preset range. If required specify product No.(x): ELD_x Product at low level ELE Number / level of product at alarm level. If required specify product No.(x): ELE_x ";
                                break;

                            case 'V':
                                eventDescription = "Modifications ";
                                eventDefinition = "Modifications have been made.";
                                break;

                            case 'W':
                                eventDescription = "No fault found ";
                                eventDefinition = "No fault was found";
                                break;

                            case 'X':
                                eventDescription = "Client Induced ";
                                eventDefinition = "Fault occurred caused by client.";
                                break;

                            case 'Y':
                                eventDescription = "Service Induced ";
                                eventDefinition = "Fault occurred caused by service technician.";
                                break;

                            case 'Z':
                                eventDescription = "Other Unlisted Fault ";
                                eventDefinition = "Fault has occurred which is not listed above.";
                                break;
                        }
                        break;
                    //Table 13: MICROWAVE
                    case 'M':
                        switch (thirdChar) {
                            case 'A':
                                eventDescription = "Emission Check ";
                                eventDefinition = "Emission check conducted.";
                                break;

                            case 'B':
                                eventDescription = "Magnetron fault ";
                                eventDefinition = "Faulty magnetron reported.";
                                break;

                            case 'C':
                                eventDescription = "Control System fault ";
                                eventDefinition = "Faulty microwave control system reported.";
                                break;

                            case 'V':
                                eventDescription = "Modifications ";
                                eventDefinition = "Modifications have been made.";
                                break;

                            case 'W':
                                eventDescription = "No Fault Found ";
                                eventDefinition = "No fault was found";
                                break;

                            case 'X':
                                eventDescription = "Client Induced ";
                                eventDefinition = "Fault occurred caused by client.";
                                break;

                            case 'Y':
                                eventDescription = "Service Induced ";
                                eventDefinition = "Fault occurred caused by service technician.";
                                break;

                            case 'Z':
                                eventDescription = "Other Unlisted Fault ";
                                eventDefinition = "Fault has occurred which is not listed above.";
                                break;

                        }
                        break;
                    //Table 14: BILL VALIDATOR
                    case 'N':
                        switch (thirdChar) {
                            case 'A':
                                eventDescription = "Bill Entry ";
                                eventDefinition = "The bill entry path is blocked.";
                                break;

                            case 'B':
                                eventDescription = "Detecting Frauds ";
                                eventDefinition = "Excessive frauds are being detected.";
                                break;

                            case 'C':
                                eventDescription = "Jammed Validator ";
                                eventDefinition = "The validator recognition path is jammed.";
                                break;

                            case 'D':
                                eventDescription = "Jammed Stacker ";
                                eventDefinition = "The stacker mechanism is jammed.";
                                break;

                            case 'E':
                                eventDescription = "Bill / Cash Box Full ";
                                eventDefinition = "The bill / cash box is full.";
                                break;

                            case 'F':
                                eventDescription = "Bill / Cash Box Removed ";
                                eventDefinition = "The bill / cash box is removed or not seated properly.";
                                break;

                            case 'G':
                                eventDescription = "Failed Validator ";
                                eventDefinition = "The validator recognition system has failed.";
                                break;

                            case 'H':
                                eventDescription = "Failed Stacker ";
                                eventDefinition = "The stacker mechanism has failed.";
                                break;

                            case 'I':
                                eventDescription = "Failed Control Board ";
                                eventDefinition = "An error condition has been detected on the control board.";
                                break;

                            case 'J':
                                eventDescription = "Failed Power Supply ";
                                eventDefinition = "An error condition has been detected on one or more of the power supplies.";
                                break;

                            case 'K':
                                eventDescription = "Comm Error A communication error has been detected and / or all communications has stopped.";
                                eventDefinition = "unknown";
                                break;

                            case 'U':
                                eventDescription = "MDB Error Codes ";
                                eventDefinition = "The error codes will take the form of ENU_xx where the xx will indicate the hexidecimal equivalent of the Status Code reported by the MDB bill validator.Example –MDB status code 00000100 b(ROM Checksum Error) reported.The event code will be: ENU_04. ";
                                break;

                            case 'V':
                                eventDescription = "Modification ";
                                eventDefinition = "Modifications have been made.";
                                break;

                            case 'W':
                                eventDescription = "No Fault Found ";
                                eventDefinition = "No fault was found";
                                break;

                            case 'X':
                                eventDescription = "Client Induced ";
                                eventDefinition = "Fault occurred caused by client.";
                                break;

                            case 'Y':
                                eventDescription = "Service Induced ";
                                eventDefinition = "Fault occurred caused by service technician.";
                                break;

                            case 'Z':
                                eventDescription = "Other unlisted operation request ";
                                eventDefinition = "Fault has occurred which is not listed above.";
                                break;

                        }
                        break;
                    //Table 15: REFRIGERATION SYSTEM
                    case 'O':
                        switch (thirdChar) {
                            case 'A':
                                eventDescription = "Temperature sensor";
                                eventDefinition = "Failed sensor or incorrect reading ";
                                break;

                            case 'B':
                                eventDescription = "Compressor Controller ";
                                eventDefinition = "Defective relay or triac causing compressor to run continously or not start";
                                break;

                            case 'C':
                                eventDescription = "Compressor ";
                                eventDefinition = "Errors include: leaks, doesn’t run , reduced capacity or tripping due to overload";
                                break;

                            case 'D':
                                eventDescription = "Compressor current Operating Relay or PTC (positive thermal coefficient)";
                                eventDefinition = "Defective or stuck current relay or PTC";
                                break;

                            case 'E':
                                eventDescription = "Compressor High Temperature Trip ";
                                eventDefinition = "Failed trip mechanism";
                                break;

                            case 'F':
                                eventDescription = "Compressor Capacitor ";
                                eventDefinition = "Failed capacitor, compresssor won’t start";
                                break;

                            case 'G':
                                eventDescription = "Capillary tube ";
                                eventDefinition = "Internal restriction or kinked tube";
                                break;

                            case 'H':
                                eventDescription = "Condenser ";
                                eventDefinition = "Has leaks or air is restricted because of dirt/debries";
                                break;

                            case 'I':
                                eventDescription = "Condenser Fans ";
                                eventDefinition = "Bent fan blade or fan motor failure";
                                break;

                            case 'J':
                                eventDescription = "Evaporator ";
                                eventDefinition = "Has leaks or air is restricted because of dirt/debries or frozen";
                                break;

                            case 'K':
                                eventDescription = "Evaporator motor ";
                                eventDefinition = "Evaporator fan motor failure";
                                break;

                            case 'L':
                                eventDescription = "Expansion Valve ";
                                eventDefinition = "Failed expansion value";
                                break;

                            case 'M':
                                eventDescription = "Refrigerant Leak ";
                                eventDefinition = "Refrigerant is leaking";
                                break;

                            case 'N':
                                eventDescription = "Defrost Controller Defective relay or triac";
                                eventDefinition = "";
                                break;
                            case 'O':
                                eventDescription = "Defrost Temperature Cutout switch";
                                eventDefinition = "Defective switch";
                                break;

                            case 'P':
                                eventDescription = "Defrost Heaters ";
                                eventDefinition = "Defective Heaters";
                                break;

                            case 'Q':
                                eventDescription = "Condensate overflow or leak ";
                                eventDefinition = "Defective condensate pan or evaporator pan, or restricted drain tube";
                                break;

                            case 'V':
                                eventDescription = "Modifications ";
                                eventDefinition = "Modifications have been made.";
                                break;

                            case 'W':
                                eventDescription = "No Fault Found ";
                                eventDefinition = "No fault was found";
                                break;

                            case 'X':
                                eventDescription = "Client Induced ";
                                eventDefinition = "Fault occurred caused by client.";
                                break;

                            case 'Y':
                                eventDescription = "Service Induced ";
                                eventDefinition = "Fault occurred caused by service technician.";
                                break;

                            case 'Z':
                                eventDescription = "Other Unlisted Fault ";
                                eventDefinition = "Fault has occurred which is not listed above.";
                                break;
                        }
                        break;
                }
                break;

            case 'O':
                switch (secondChar) {
                    //Table 16: OPERATIONS REQUEST
                    case 'A':
                        switch (thirdChar) {
                            case 'A':
                                eventDescription = "Maintenance ";
                                eventDefinition = "Maintenance services (some specific services are listeted below)";
                                break;

                            case 'B':
                                eventDescription = "Inspecting Equipment / Quality Check";
                                eventDefinition = "Inspecting and checking Product / Function / Service";
                                break;

                            case 'C':
                                eventDescription = "Deliver Machine ";
                                eventDefinition = "Delivery to the customer";
                                break;

                            case 'D':
                                eventDescription = "Deliver/install Machine ";
                                eventDefinition = "Delivery and installation at the customer site";
                                break;

                            case 'E':
                                eventDescription = "Install Machine ";
                                eventDefinition = "Installation at the customer site";
                                break;

                            case 'F':
                                eventDescription = "Exchange Machine ";
                                eventDefinition = "Replace a machine at the customer by another machine";
                                break;

                            case 'G':
                                eventDescription = "Collect Machine ";
                                eventDefinition = "Collect from the customer site";
                                break;

                            case 'H':
                                eventDescription = "Resite Machine ";
                                eventDefinition = "Move the machine from one place at the customer to another";
                                break;

                            case 'I':
                                eventDescription = "Staff Training ";
                                eventDefinition = "Training of operations staff";
                                break;

                            case 'J':
                                eventDescription = "Sanitizing ";
                                eventDefinition = "Sanitizing the vending machine";
                                break;

                            case 'K':
                                eventDescription = "Filter Change ";
                                eventDefinition = "Water filter change";
                                break;

                            case 'L':
                                eventDescription = "Price Change ";
                                eventDefinition = "If required specify product No.(x): OAL_x";
                                break;

                            case 'M':
                                eventDescription = "Machine Recipe Altered / Ingredient Adjusted";
                                eventDefinition = "If required specify product No.(x): OAM_x";
                                break;

                            case 'N':
                                eventDescription = "Meter Check ";
                                eventDefinition = "Check ingredience quantity according the recipe";
                                break;

                            case 'O':
                                eventDescription = "CO2 Change ";
                                eventDefinition = "Replace used bottle by full bottle";
                                break;

                            case 'P':
                                eventDescription = "Loss Check ";
                                eventDefinition = "Action required due to any kind of loss";
                                break;

                            case 'Q':
                                eventDescription = "De-greasing ";
                                eventDefinition = "Brewer de-greasing";
                                break;

                            case 'R':
                                eventDescription = "Sterilizing ";
                                eventDefinition = "For higyene purpose";
                                break;

                            case 'S':
                                eventDescription = "Collect Authorities Reporting Data ";
                                eventDefinition = "Reporting to country specific or local authorities";
                                break;

                            case 'T':
                                eventDescription = "Product Change ";
                                eventDefinition = "If required specify product No.(x): OAT_x";
                                break;

                            case 'U':
                                eventDescription = "Start Promotion ";
                                eventDefinition = "If required specify product No.(x): OAU_x";
                                break;
                            case '1':
                                switch (charactersCode[3]) {
                                    case 'A':
                                        eventDescription = "End Promotion ";
                                        eventDefinition = "If required specify product No.(x): OA1A_x";
                                        break;

                                    case 'B':
                                        eventDescription = "All Products filled up to restock level ";
                                        eventDefinition = "All Products are filled to the required restock level";
                                        break;

                                    case 'C':
                                        eventDescription = "Product filled up to restock level ";
                                        eventDefinition = "Specific Product is filled to the required restock level. Specify product No.(x): OA1C_x";
                                        break;

                                }
                                break;
                        }

                        //Table 17: SERVICE RELATED
                    case 'B':
                        switch (thirdChar) {
                            case 'A':
                                eventDescription = "Incorrect Loading ";
                                eventDefinition = "Wrong product, place, quantity,spiral position, … (some specific situations are listed below)";
                                break;

                            case 'B':
                                eventDescription = "Door Left Open ";
                                eventDefinition = "Left open by mistake";
                                break;

                            case 'C':
                                eventDescription = "Product Low / Empty ";
                                eventDefinition = "Quantity not sufficient until next regular visit (estimation). If required specify product No.(x): OBC_x";
                                break;

                            case 'D':
                                eventDescription = "Cups Low / Empty ";
                                eventDefinition = "Quantity not sufficient until next regular visit (estimation).";
                                break;

                            case 'E':
                                eventDescription = "Product Faulty ";
                                eventDefinition = "Packaging, quality, ingredients, additives, out of date, temperature, etc.";
                                break;

                            case 'F':
                                eventDescription = "Cups Faulty ";
                                eventDefinition = "Broken, blocked, wrong size, wrong type CO2 Low / Empty OBG Quantity not sufficient until next regular visit (estimation).";
                                break;

                            case 'H':
                                eventDescription = "Bucket full or out of place ";
                                eventDefinition = "Waste bucket not in correct position or necessary to empty";
                                break;

                            case 'I':
                                eventDescription = "Pipe out of place ";
                                eventDefinition = "Waste water pipe not in correct position";
                                break;

                            case 'J':
                                eventDescription = "Wrong Price ";
                                eventDefinition = "If required specify product No.(x): OBJ_x";
                                break;

                            case 'K':
                                eventDescription = "No/Incorrect Change ";
                                eventDefinition = "Changegiver";
                                break;

                            case 'L':
                                eventDescription = "Incorrect Assembly ";
                                eventDefinition = "Wrong position, bad positioned, not or not properly connected";
                                break;

                            case 'M':
                                eventDescription = "Service Needed ";
                                eventDefinition = "Induced by customer, consumer, operator";
                                break;

                            case 'N':
                                eventDescription = "Extract Duct Blocked ";
                                eventDefinition = "If required specify product No.(x): OBN_x";
                                break;

                            case 'O':
                                eventDescription = "Cash Box Full ";
                                eventDefinition = "Coins and/or bills and/or tokens";
                                break;

                            case 'P':
                                eventDescription = "Dirty Coin Unit ";
                                eventDefinition = "Low, wrong or no coin and/or tokens acceptance";
                                break;

                            case 'Q':
                                eventDescription = "Dirt Blocking Pipe ";
                                eventDefinition = "If required specify product No.(x): OBQ_x";
                                break;

                            case 'R':
                                eventDescription = "Dirty Bill Unit ";
                                eventDefinition = "Low, wrong or no bill acceptance";
                                break;

                            case 'S':
                                eventDescription = "Value Carrier refused ";
                                eventDefinition = "Cashless device refuses value carriers unexpectedly";
                                break;

                            case 'T':
                                eventDescription = "Cooling ";
                                eventDefinition = "Insufficient cooling: Temperature of cold drinks and/or (liquid) ingredients and/or food is too high (or eventually too low)";
                                break;

                            case 'V':
                                eventDescription = "Modification ";
                                eventDefinition = "unknown";
                                break;

                            case 'W':
                                eventDescription = "No Fault Found ";
                                eventDefinition = "unknown";
                                break;

                            case 'X':
                                eventDescription = "Client Induced ";
                                eventDefinition = "unknown";
                                break;

                            case 'Y':
                                eventDescription = "Service Induced ";
                                eventDefinition = "unknown";
                                break;

                            case 'Z':
                                eventDescription = "Other unlisted service related actions";
                                eventDefinition = "unknown";
                                break;

                        }
                        break;

                    //Table 18: CUSTOMER INDUCED
                    case 'C':
                        switch (thirdChar) {
                            case 'A':
                                eventDescription = "Theft ";
                                eventDefinition = "Machine forced, cash box, money or products stolen";
                                break;

                            case 'B':
                                eventDescription = "Vandalism Damage ";
                                eventDefinition = "Parts broken, spilled, destroied, grafity,etc. done on purpose…";
                                break;

                            case 'C':
                                eventDescription = "Coin Path Blocked ";
                                eventDefinition = "Slot coinmech blocked (chewing gum, self made coins, dirt, …)";
                                break;

                            case 'D':
                                eventDescription = "Liquid Spillage ";
                                eventDefinition = "Soup, coffee or other liquid products are spilled in the vending machine";
                                break;

                            case 'E':
                                eventDescription = "Bill Path Blocked ";
                                eventDefinition = "Slot bill reader blocked (cards, paper, …)";
                                break;

                            case 'F':
                                eventDescription = "Power Supply Interrupted ";
                                eventDefinition = "Machine out of order due to power failure";
                                break;

                            case 'G':
                                eventDescription = "Water supply Interrupted ";
                                eventDefinition = "Products prepared with water are not available";
                                break;

                            case 'H':
                                eventDescription = "Access to Machine Obstructed ";
                                eventDefinition = "Consumer, operator or technician has no or insufficient access to vending machine";
                                break;

                            case 'I':
                                eventDescription = "Cheating Trials ";
                                eventDefinition = "Multiplying money (fraud) in order to get products for free or a lower price, …";
                                break;

                            case 'J':
                                eventDescription = "Customer Communication Network Interrupted";
                                eventDefinition = "No access to customer database (central credit or debit), server shut down, …";
                                break;

                            case 'K':
                                eventDescription = "External Communication Network Interrupted";
                                eventDefinition = "No communication between operator’s communication tool and vending machine";
                                break;

                            case 'L':
                                eventDescription = "Wrong Programming of Payment Media";
                                eventDefinition = "Identification media or value carrier are not or wrong programmed";
                                break;

                            case 'M':
                                eventDescription = "System Operating Failure ";
                                eventDefinition = "Vending machine not ready to sale due to system operating failure";
                                break;

                            case 'N':
                                eventDescription = "System Configuring Failure ";
                                eventDefinition = "Vending machine not ready to sale due to system configuring failure ";
                                break;

                            case 'Z':
                                eventDescription = "Other ";
                                eventDefinition = "dsdsd";
                                break;

                        }
                        break;

                    //Table 19: RETURN VISITS
                    case 'D':
                        switch (thirdChar) {
                            case 'A':
                                eventDescription = "Part Fitted ";
                                eventDefinition = "If required specify part x: ODA_x";
                                break;

                            case 'B':
                                eventDescription = "Coin Unit Replaced ";
                                eventDefinition = "Unknown";
                                break;

                            case 'C':
                                eventDescription = "Cold Unit Replaced ";
                                eventDefinition = "Unknown";
                                break;

                            case 'D':
                                eventDescription = "Vandalism Repair ";
                                eventDefinition = "If required specify repair job (x): ODD_x";
                                break;

                            case 'E':
                                eventDescription = "PR Visit ";
                                eventDefinition = "If required specify public relations job (x): ODE_x";
                                break;

                            case 'F':
                                eventDescription = "Check Previous Work ";
                                eventDefinition = "If required specify previous work (x): ODF_x";
                                break;

                            case 'Z':
                                eventDescription = "Other";
                                eventDefinition = "Unknown";
                                break;

                        }
                        break;
                    //Table 20: MACHINE HISTORY
                    case 'E':
                        switch (thirdChar) {
                            case 'A':
                                eventDescription = "Out of Hours Call ";
                                eventDefinition = "Event detection outside office hours of the service/operating company";
                                break;

                            case 'B':
                                eventDescription = "Coin Conversion ";
                                eventDefinition = "Coin configuration change giver";
                                break;

                            case 'Z':
                                eventDescription = "Other ";
                                eventDefinition = "fdf";
                                break;
                        }
                        break;
                    //Table 21: CASH COLLECTION
                    case 'F':
                        switch (thirdChar) {
                            case 'A':
                                eventDescription = "Coins ";
                                eventDefinition = "Coin and/or token box emptied";
                                break;

                            case 'B':
                                eventDescription = "Bills ";
                                eventDefinition = "Bill box / stacker emptied";
                                break;

                            case 'C':
                                eventDescription = "Cashless ";
                                eventDefinition = "Audit data delivered to clearing center (electronic purse, mobile payment)";
                                break;

                            case 'D':
                                eventDescription = "Tubes ";
                                eventDefinition = "Tubes emptied";
                                break;

                        }
                        break;

                }
                break;
        }
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventDefinition() {
        return eventDefinition;
    }

    public void setEventDefinition(String eventDefinition) {
        this.eventDefinition = eventDefinition;
    }
}
