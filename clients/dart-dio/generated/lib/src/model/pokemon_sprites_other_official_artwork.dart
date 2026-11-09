//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_sprites_other_official_artwork.g.dart';

/// PokemonSpritesOtherOfficialArtwork
///
/// Properties:
/// * [frontDefault] - The URL of the default front official artwork, or null if unavailable.
/// * [frontShiny] - The URL of the shiny front official artwork, or null if unavailable.
/// * [versions] - Additional official artwork grouped by version. Available keys vary by resource.
@BuiltValue()
abstract class PokemonSpritesOtherOfficialArtwork implements Built<PokemonSpritesOtherOfficialArtwork, PokemonSpritesOtherOfficialArtworkBuilder> {
  /// The URL of the default front official artwork, or null if unavailable.
  @BuiltValueField(wireName: r'front_default')
  String? get frontDefault;

  /// The URL of the shiny front official artwork, or null if unavailable.
  @BuiltValueField(wireName: r'front_shiny')
  String? get frontShiny;

  /// Additional official artwork grouped by version. Available keys vary by resource.
  @BuiltValueField(wireName: r'versions')
  BuiltMap<String, BuiltMap<String, JsonObject?>>? get versions;

  PokemonSpritesOtherOfficialArtwork._();

  factory PokemonSpritesOtherOfficialArtwork([void updates(PokemonSpritesOtherOfficialArtworkBuilder b)]) = _$PokemonSpritesOtherOfficialArtwork;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonSpritesOtherOfficialArtworkBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonSpritesOtherOfficialArtwork> get serializer => _$PokemonSpritesOtherOfficialArtworkSerializer();
}

class _$PokemonSpritesOtherOfficialArtworkSerializer implements PrimitiveSerializer<PokemonSpritesOtherOfficialArtwork> {
  @override
  final Iterable<Type> types = const [PokemonSpritesOtherOfficialArtwork, _$PokemonSpritesOtherOfficialArtwork];

  @override
  final String wireName = r'PokemonSpritesOtherOfficialArtwork';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonSpritesOtherOfficialArtwork object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'front_default';
    yield object.frontDefault == null ? null : serializers.serialize(
      object.frontDefault,
      specifiedType: const FullType.nullable(String),
    );
    yield r'front_shiny';
    yield object.frontShiny == null ? null : serializers.serialize(
      object.frontShiny,
      specifiedType: const FullType.nullable(String),
    );
    if (object.versions != null) {
      yield r'versions';
      yield serializers.serialize(
        object.versions,
        specifiedType: const FullType(BuiltMap, [FullType(String), FullType(BuiltMap, [FullType(String), FullType.nullable(JsonObject)])]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonSpritesOtherOfficialArtwork object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonSpritesOtherOfficialArtworkBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'front_default':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.frontDefault = valueDes;
          break;
        case r'front_shiny':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.frontShiny = valueDes;
          break;
        case r'versions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltMap, [FullType(String), FullType(BuiltMap, [FullType(String), FullType.nullable(JsonObject)])]),
          ) as BuiltMap<String, BuiltMap<String, JsonObject?>>?;
          if (valueDes == null) continue;
          result.versions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonSpritesOtherOfficialArtwork deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonSpritesOtherOfficialArtworkBuilder();
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


