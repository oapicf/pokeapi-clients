//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pokemon_sprites_other_dream_world.dart';
import 'package:openapi/src/model/pokemon_sprites_other_showdown.dart';
import 'package:openapi/src/model/pokemon_sprites_other_home.dart';
import 'package:openapi/src/model/pokemon_sprites_other_official_artwork.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_sprites_other.g.dart';

/// PokemonSpritesOther
///
/// Properties:
/// * [dreamWorld] - Pokémon Dream World artwork URLs.
/// * [home] - Pokémon HOME sprite URLs.
/// * [showdown] - Pokémon Showdown sprite URLs.
/// * [officialArtwork] - Official Pokémon artwork URLs, including shiny artwork and version-specific variants.
@BuiltValue()
abstract class PokemonSpritesOther implements Built<PokemonSpritesOther, PokemonSpritesOtherBuilder> {
  /// Pokémon Dream World artwork URLs.
  @BuiltValueField(wireName: r'dream_world')
  PokemonSpritesOtherDreamWorld? get dreamWorld;

  /// Pokémon HOME sprite URLs.
  @BuiltValueField(wireName: r'home')
  PokemonSpritesOtherHome? get home;

  /// Pokémon Showdown sprite URLs.
  @BuiltValueField(wireName: r'showdown')
  PokemonSpritesOtherShowdown? get showdown;

  /// Official Pokémon artwork URLs, including shiny artwork and version-specific variants.
  @BuiltValueField(wireName: r'official-artwork')
  PokemonSpritesOtherOfficialArtwork? get officialArtwork;

  PokemonSpritesOther._();

  factory PokemonSpritesOther([void updates(PokemonSpritesOtherBuilder b)]) = _$PokemonSpritesOther;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonSpritesOtherBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonSpritesOther> get serializer => _$PokemonSpritesOtherSerializer();
}

class _$PokemonSpritesOtherSerializer implements PrimitiveSerializer<PokemonSpritesOther> {
  @override
  final Iterable<Type> types = const [PokemonSpritesOther, _$PokemonSpritesOther];

  @override
  final String wireName = r'PokemonSpritesOther';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonSpritesOther object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.dreamWorld != null) {
      yield r'dream_world';
      yield serializers.serialize(
        object.dreamWorld,
        specifiedType: const FullType(PokemonSpritesOtherDreamWorld),
      );
    }
    if (object.home != null) {
      yield r'home';
      yield serializers.serialize(
        object.home,
        specifiedType: const FullType(PokemonSpritesOtherHome),
      );
    }
    if (object.showdown != null) {
      yield r'showdown';
      yield serializers.serialize(
        object.showdown,
        specifiedType: const FullType(PokemonSpritesOtherShowdown),
      );
    }
    if (object.officialArtwork != null) {
      yield r'official-artwork';
      yield serializers.serialize(
        object.officialArtwork,
        specifiedType: const FullType(PokemonSpritesOtherOfficialArtwork),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonSpritesOther object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonSpritesOtherBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'dream_world':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PokemonSpritesOtherDreamWorld),
          ) as PokemonSpritesOtherDreamWorld?;
          if (valueDes == null) continue;
          result.dreamWorld.replace(valueDes);
          break;
        case r'home':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PokemonSpritesOtherHome),
          ) as PokemonSpritesOtherHome?;
          if (valueDes == null) continue;
          result.home.replace(valueDes);
          break;
        case r'showdown':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PokemonSpritesOtherShowdown),
          ) as PokemonSpritesOtherShowdown?;
          if (valueDes == null) continue;
          result.showdown.replace(valueDes);
          break;
        case r'official-artwork':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PokemonSpritesOtherOfficialArtwork),
          ) as PokemonSpritesOtherOfficialArtwork?;
          if (valueDes == null) continue;
          result.officialArtwork.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonSpritesOther deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonSpritesOtherBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}


