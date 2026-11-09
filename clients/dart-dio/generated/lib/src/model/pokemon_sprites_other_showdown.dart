//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_sprites_other_showdown.g.dart';

/// PokemonSpritesOtherShowdown
///
/// Properties:
/// * [frontDefault] - The URL of the default Pokémon Showdown front image, or null if unavailable.
/// * [frontFemale] - The URL of the female Pokémon Showdown front image, or null if unavailable.
/// * [frontShiny] - The URL of the shiny Pokémon Showdown front image, or null if unavailable.
/// * [frontShinyFemale] - The URL of the shiny female Pokémon Showdown front image, or null if unavailable.
/// * [backDefault] - The URL of the default Pokémon Showdown back image, or null if unavailable.
/// * [backFemale] - The URL of the female Pokémon Showdown back image, or null if unavailable.
/// * [backShiny] - The URL of the shiny Pokémon Showdown back image, or null if unavailable.
/// * [backShinyFemale] - The URL of the shiny female Pokémon Showdown back image, or null if unavailable.
@BuiltValue()
abstract class PokemonSpritesOtherShowdown implements Built<PokemonSpritesOtherShowdown, PokemonSpritesOtherShowdownBuilder> {
  /// The URL of the default Pokémon Showdown front image, or null if unavailable.
  @BuiltValueField(wireName: r'front_default')
  String? get frontDefault;

  /// The URL of the female Pokémon Showdown front image, or null if unavailable.
  @BuiltValueField(wireName: r'front_female')
  String? get frontFemale;

  /// The URL of the shiny Pokémon Showdown front image, or null if unavailable.
  @BuiltValueField(wireName: r'front_shiny')
  String? get frontShiny;

  /// The URL of the shiny female Pokémon Showdown front image, or null if unavailable.
  @BuiltValueField(wireName: r'front_shiny_female')
  String? get frontShinyFemale;

  /// The URL of the default Pokémon Showdown back image, or null if unavailable.
  @BuiltValueField(wireName: r'back_default')
  String? get backDefault;

  /// The URL of the female Pokémon Showdown back image, or null if unavailable.
  @BuiltValueField(wireName: r'back_female')
  String? get backFemale;

  /// The URL of the shiny Pokémon Showdown back image, or null if unavailable.
  @BuiltValueField(wireName: r'back_shiny')
  String? get backShiny;

  /// The URL of the shiny female Pokémon Showdown back image, or null if unavailable.
  @BuiltValueField(wireName: r'back_shiny_female')
  String? get backShinyFemale;

  PokemonSpritesOtherShowdown._();

  factory PokemonSpritesOtherShowdown([void updates(PokemonSpritesOtherShowdownBuilder b)]) = _$PokemonSpritesOtherShowdown;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonSpritesOtherShowdownBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonSpritesOtherShowdown> get serializer => _$PokemonSpritesOtherShowdownSerializer();
}

class _$PokemonSpritesOtherShowdownSerializer implements PrimitiveSerializer<PokemonSpritesOtherShowdown> {
  @override
  final Iterable<Type> types = const [PokemonSpritesOtherShowdown, _$PokemonSpritesOtherShowdown];

  @override
  final String wireName = r'PokemonSpritesOtherShowdown';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonSpritesOtherShowdown object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'front_default';
    yield object.frontDefault == null ? null : serializers.serialize(
      object.frontDefault,
      specifiedType: const FullType.nullable(String),
    );
    yield r'front_female';
    yield object.frontFemale == null ? null : serializers.serialize(
      object.frontFemale,
      specifiedType: const FullType.nullable(String),
    );
    yield r'front_shiny';
    yield object.frontShiny == null ? null : serializers.serialize(
      object.frontShiny,
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
    yield r'back_female';
    yield object.backFemale == null ? null : serializers.serialize(
      object.backFemale,
      specifiedType: const FullType.nullable(String),
    );
    yield r'back_shiny';
    yield object.backShiny == null ? null : serializers.serialize(
      object.backShiny,
      specifiedType: const FullType.nullable(String),
    );
    yield r'back_shiny_female';
    yield object.backShinyFemale == null ? null : serializers.serialize(
      object.backShinyFemale,
      specifiedType: const FullType.nullable(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonSpritesOtherShowdown object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonSpritesOtherShowdownBuilder result,
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
        case r'front_female':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.frontFemale = valueDes;
          break;
        case r'front_shiny':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.frontShiny = valueDes;
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
        case r'back_female':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.backFemale = valueDes;
          break;
        case r'back_shiny':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.backShiny = valueDes;
          break;
        case r'back_shiny_female':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.backShinyFemale = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonSpritesOtherShowdown deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonSpritesOtherShowdownBuilder();
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


