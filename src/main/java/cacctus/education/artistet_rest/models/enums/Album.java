package cacctus.education.artistet_rest.models.enums;

import lombok.Getter;

@Getter
public enum Album {
    HARMONY_HAVEN("Harmony Haven"),
    MIDNIGHT_SERENADE("Midnight Serenade"),
    ECHOES_OF_ETERNITY("Echoes of Eternity"),
    STELLAR_DREAMS("Stellar Dreams"),
    ENCHANTED_ECHO("Enchanted Echo"),
    CELESTIAL_SYMPHONY("Celestial Symphony"),
    WHISPERS_IN_THE_WIND("Whispers in the Wind"),
    RADIANT_REVERIE("Radiant Reverie"),
    LUMINOUS_LEGACY("Luminous Legacy"),
    SERENDIPITY_SONATA("Serendipity Sonata"),
    TRANQUIL_TWILIGHT("Tranquil Twilight"),
    COSMIC_CADENCE("Cosmic Cadence"),
    MELODIC_MIRAGE("Melodic Mirage"),
    ETHEREAL_ENIGMA("Ethereal Enigma"),
    REFLECTIONS_OF_RADIANCE("Reflections of Radiance"),
    SOLAR_SERENITY("Solar Serenity"),
    ZENITH_ZEN("Zenith Zen"),
    ASTRAL_ARIA("Astral Aria"),
    MYSTICAL_MELODIES("Mystical Melodies"),
    JOURNEY_TO_INFINITY("Journey to Infinity");

    private final String albumName;

    Album(String albumName) {
        this.albumName = albumName;
    }

}
