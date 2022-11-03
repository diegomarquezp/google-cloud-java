/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/routing/v2/toll_passes.proto

package com.google.maps.routing.v2;

public final class TollPassesProto {
  private TollPassesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/maps/routing/v2/toll_passes.pro"
          + "to\022\026google.maps.routing.v2*\201\021\n\010TollPass\022"
          + "\031\n\025TOLL_PASS_UNSPECIFIED\020\000\022\020\n\014AU_ETOLL_T"
          + "AG\020R\022\017\n\013AU_EWAY_TAG\020S\022\014\n\010AU_LINKT\020\002\022\017\n\013A"
          + "R_TELEPASE\020\003\022\023\n\017BR_AUTO_EXPRESO\020Q\022\020\n\014BR_"
          + "CONECTCAR\020\007\022\020\n\014BR_MOVE_MAIS\020\010\022\023\n\017BR_PASS"
          + "A_RAPIDO\020X\022\020\n\014BR_SEM_PARAR\020\t\022\014\n\010BR_TAGGY"
          + "\020\n\022\014\n\010BR_VELOE\020\013\022)\n%CA_US_AKWASASNE_SEAW"
          + "AY_CORPORATE_CARD\020T\022\'\n#CA_US_AKWASASNE_S"
          + "EAWAY_TRANSIT_CARD\020U\022\036\n\032CA_US_BLUE_WATER"
          + "_EDGE_PASS\020\022\022\023\n\017CA_US_CONNEXION\020\023\022\024\n\020CA_"
          + "US_NEXUS_CARD\020\024\022\r\n\tID_E_TOLL\020\020\022\r\n\tIN_FAS"
          + "TAG\020N\022\034\n\030IN_LOCAL_HP_PLATE_EXEMPT\020O\022\013\n\007M"
          + "X_IAVE\020Z\022\013\n\007MX_PASE\020[\022\020\n\014MX_QUICKPASS\020]\022"
          + "\"\n\036MX_SISTEMA_TELEPEAJE_CHIHUAHUA\020Y\022\017\n\013M"
          + "X_TAG_IAVE\020\014\022\022\n\016MX_TAG_TELEVIA\020\r\022\016\n\nMX_T"
          + "ELEVIA\020\\\022\016\n\nMX_VIAPASS\020\016\022\026\n\022US_AL_FREEDO"
          + "M_PASS\020\025\0222\n.US_AK_ANTON_ANDERSON_TUNNEL_"
          + "BOOK_OF_10_TICKETS\020\026\022\021\n\rUS_CA_FASTRAK\020\004\022"
          + "\035\n\031US_CA_FASTRAK_CAV_STICKER\020V\022\025\n\021US_CO_"
          + "EXPRESSTOLL\020\027\022\021\n\rUS_CO_GO_PASS\020\030\022\022\n\016US_D"
          + "E_EZPASSDE\020\031\022$\n US_FL_BOB_SIKES_TOLL_BRI"
          + "DGE_PASS\020A\022:\n6US_FL_DUNES_COMMUNITY_DEVE"
          + "LOPMENT_DISTRICT_EXPRESSCARD\020B\022\017\n\013US_FL_"
          + "EPASS\020C\022\030\n\024US_FL_GIBA_TOLL_PASS\020D\022\020\n\014US_"
          + "FL_LEEWAY\020E\022\021\n\rUS_FL_SUNPASS\020F\022\025\n\021US_FL_"
          + "SUNPASS_PRO\020G\022\022\n\016US_IL_EZPASSIL\020I\022\017\n\013US_"
          + "IL_IPASS\020H\022\022\n\016US_IN_EZPASSIN\020\032\022\032\n\026US_KS_"
          + "BESTPASS_HORIZON\020\033\022\016\n\nUS_KS_KTAG\020\034\022\026\n\022US"
          + "_KS_NATIONALPASS\020\035\022\033\n\027US_KS_PREPASS_ELIT"
          + "EPASS\020\036\022\023\n\017US_KY_RIVERLINK\020\037\022\023\n\017US_LA_GE"
          + "AUXPASS\020 \022\022\n\016US_LA_TOLL_TAG\020!\022\022\n\016US_MA_E"
          + "ZPASSMA\020\006\022\022\n\016US_MD_EZPASSMD\020\"\022\022\n\016US_ME_E"
          + "ZPASSME\020#\0221\n-US_MI_AMBASSADOR_BRIDGE_PRE"
          + "MIER_COMMUTER_CARD\020$\022)\n%US_MI_GROSSE_ILE"
          + "_TOLL_BRIDGE_PASS_TAG\020%\022\026\n\022US_MI_IQ_PROX"
          + "_CARD\020&\022\"\n\036US_MI_MACKINAC_BRIDGE_MAC_PAS"
          + "S\020\'\022\027\n\023US_MI_NEXPRESS_TOLL\020(\022\022\n\016US_MN_EZ"
          + "PASSMN\020)\022\022\n\016US_NC_EZPASSNC\020*\022\024\n\020US_NC_PE"
          + "ACH_PASS\020W\022\024\n\020US_NC_QUICK_PASS\020+\022\022\n\016US_N"
          + "H_EZPASSNH\020P\022 \n\034US_NJ_DOWNBEACH_EXPRESS_"
          + "PASS\020K\022\022\n\016US_NJ_EZPASSNJ\020J\022\025\n\021US_NY_EXPR"
          + "ESSPASS\020L\022\022\n\016US_NY_EZPASSNY\020M\022\022\n\016US_OH_E"
          + "ZPASSOH\020,\022\022\n\016US_PA_EZPASSPA\020-\022\022\n\016US_RI_E"
          + "ZPASSRI\020.\022\021\n\rUS_SC_PALPASS\020/\022\022\n\016US_TX_BA"
          + "NCPASS\0200\022\026\n\022US_TX_DEL_RIO_PASS\0201\022\024\n\020US_T"
          + "X_EFAST_PASS\0202\022!\n\035US_TX_EAGLE_PASS_EXPRE"
          + "SS_CARD\0203\022\020\n\014US_TX_EPTOLL\0204\022\022\n\016US_TX_EZ_"
          + "CROSS\0205\022\017\n\013US_TX_EZTAG\0206\022\032\n\026US_TX_LAREDO"
          + "_TRADE_TAG\0207\022\022\n\016US_TX_PLUSPASS\0208\022\021\n\rUS_T"
          + "X_TOLLTAG\0209\022\017\n\013US_TX_TXTAG\020:\022\025\n\021US_TX_XP"
          + "RESS_CARD\020;\022\'\n#US_UT_ADAMS_AVE_PARKWAY_E"
          + "XPRESSCARD\020<\022\022\n\016US_VA_EZPASSVA\020=\022\022\n\016US_W"
          + "A_BREEZEBY\020\021\022\024\n\020US_WA_GOOD_TO_GO\020\001\022\022\n\016US"
          + "_WV_EZPASSWV\020>\022!\n\035US_WV_MEMORIAL_BRIDGE_"
          + "TICKETS\020?\022#\n\037US_WV_NEWELL_TOLL_BRIDGE_TI"
          + "CKET\020@B\307\001\n\032com.google.maps.routing.v2B\017T"
          + "ollPassesProtoP\001Z=google.golang.org/genp"
          + "roto/googleapis/maps/routing/v2;routing\370"
          + "\001\001\242\002\005GMRV2\252\002\026Google.Maps.Routing.V2\312\002\026Go"
          + "ogle\\Maps\\Routing\\V2\352\002\031Google::Maps::Rou"
          + "ting::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
  }

  // @@protoc_insertion_point(outer_class_scope)
}
