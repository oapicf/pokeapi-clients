//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/json_object.dart';
import 'package:openapi/src/model/pokemon_sprites_other.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_form_sprites.g.dart';

/// PokemonFormSprites
///
/// Properties:
/// * [frontDefault] - The default depiction of this Pokémon from the front in battle.
/// * [frontShiny] - The shiny depiction of this Pokémon from the front in battle.
/// * [frontFemale] - The female depiction of this Pokémon from the front in battle.
/// * [frontShinyFemale] - The shiny female depiction of this Pokémon from the front in battle.
/// * [backDefault] - The default depiction of this Pokémon from the back in battle.
/// * [backShiny] - The shiny depiction of this Pokémon from the back in battle.
/// * [backFemale] - The female depiction of this Pokémon from the back in battle.
/// * [backShinyFemale] - The shiny female depiction of this Pokémon from the back in battle.
/// * [other] - Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
/// * [versions] - Sprites grouped by generation and game. Available keys vary by resource.
@BuiltValue()
abstract class PokemonFormSprites implements Built<PokemonFormSprites, PokemonFormSpritesBuilder> {
  /// The default depiction of this Pokémon from the front in battle.
  @BuiltValueField(wireName: r'front_default')
  String? get frontDefault;

  /// The shiny depiction of this Pokémon from the front in battle.
  @BuiltValueField(wireName: r'front_shiny')
  String? get frontShiny;

  /// The female depiction of this Pokémon from the front in battle.
  @BuiltValueField(wireName: r'front_female')
  String? get frontFemale;

  /// The shiny female depiction of this Pokémon from the front in battle.
  @BuiltValueField(wireName: r'front_shiny_female')
  String? get frontShinyFemale;

  /// The default depiction of this Pokémon from the back in battle.
  @BuiltValueField(wireName: r'back_default')
  String? get backDefault;

  /// The shiny depiction of this Pokémon from the back in battle.
  @BuiltValueField(wireName: r'back_shiny')
  String? get backShiny;

  /// The female depiction of this Pokémon from the back in battle.
  @BuiltValueField(wireName: r'back_female')
  String? get backFemale;

  /// The shiny female depiction of this Pokémon from the back in battle.
  @BuiltValueField(wireName: r'back_shiny_female')
  String? get backShinyFemale;

  /// Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
  @BuiltValueField(wireName: r'other')
  PokemonSpritesOther? get other;

  /// Sprites grouped by generation and game. Available keys vary by resource.
  @BuiltValueField(wireName: r'versions')
  BuiltMap<String, BuiltMap<String, JsonObject?>>? get versions;

  PokemonFormSprites._();

  factory PokemonFormSprites([void updates(PokemonFormSpritesBuilder b)]) = _$PokemonFormSprites;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonFormSpritesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonFormSprites> get serializer => _$PokemonFormSpritesSerializer();
}

class _$PokemonFormSpritesSerializer implements PrimitiveSerializer<PokemonFormSprites> {
  @override
  final Iterable<Type> types = const [PokemonFormSprites, _$PokemonFormSprites];

  @override
  final String wireName = r'PokemonFormSprites';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonFormSprites object, {
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
    yield r'front_female';
    yield object.frontFemale == null ? null : serializers.serialize(
      object.frontFemale,
      specifiedType: const FullType.nullable(String),
    );
    yield r'front_shiny_female';
    yield object.frontShinyFemale == null ? null : serializers.serialize(
      object.frontShinyFemale,
      specifiedType: const FullType.nullable(String),
    );
    yield r'back_default';
    yield object.backDefault == null ? null : serializers.serialize(
      object.backDefault,
      specifiedType: const FullType.nullable(String),
    );
    yield r'back_shiny';
    yield object.backShiny == null ? null : serializers.serialize(
      object.backShiny,
      specifiedType: const FullType.nullable(String),
    );
    yield r'back_female';
    yield object.backFemale == null ? null : serializers.serialize(
      object.backFemale,
      specifiedType: const FullType.nullable(String),
    );
    yield r'back_shiny_female';
    yield object.backShinyFemale == null ? null : serializers.serialize(
      object.backShinyFemale,
      specifiedType: const FullType.nullable(String),
    );
    if (object.other != null) {
      yield r'other';
      yield serializers.serialize(
        object.other,
        specifiedType: const FullType(PokemonSpritesOther),
      );
    }
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
    PokemonFormSprites object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonFormSpritesBuilder result,
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
        case r'front_female':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.frontFemale = valueDes;
          break;
        case r'front_shiny_female':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.frontShinyFemale = valueDes;
          break;
        case r'back_default':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.backDefault = valueDes;
          break;
        case r'back_shiny':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.backShiny = valueDes;
          break;
        case r'back_female':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.backFemale = valueDes;
          break;
        case r'back_shiny_female':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.backShinyFemale = valueDes;
          break;
        case r'other':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PokemonSpritesOther),
          ) as PokemonSpritesOther?;
          if (valueDes == null) continue;
          result.other.replace(valueDes);
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
  PokemonFormSprites deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonFormSpritesBuilder();
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


