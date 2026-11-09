//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_sprites_other_home.g.dart';

/// PokemonSpritesOtherHome
///
/// Properties:
/// * [frontDefault] - The URL of the default Pokémon HOME front image, or null if unavailable.
/// * [frontFemale] - The URL of the female Pokémon HOME front image, or null if unavailable.
/// * [frontShiny] - The URL of the shiny Pokémon HOME front image, or null if unavailable.
/// * [frontShinyFemale] - The URL of the shiny female Pokémon HOME front image, or null if unavailable.
@BuiltValue()
abstract class PokemonSpritesOtherHome implements Built<PokemonSpritesOtherHome, PokemonSpritesOtherHomeBuilder> {
  /// The URL of the default Pokémon HOME front image, or null if unavailable.
  @BuiltValueField(wireName: r'front_default')
  String? get frontDefault;

  /// The URL of the female Pokémon HOME front image, or null if unavailable.
  @BuiltValueField(wireName: r'front_female')
  String? get frontFemale;

  /// The URL of the shiny Pokémon HOME front image, or null if unavailable.
  @BuiltValueField(wireName: r'front_shiny')
  String? get frontShiny;

  /// The URL of the shiny female Pokémon HOME front image, or null if unavailable.
  @BuiltValueField(wireName: r'front_shiny_female')
  String? get frontShinyFemale;

  PokemonSpritesOtherHome._();

  factory PokemonSpritesOtherHome([void updates(PokemonSpritesOtherHomeBuilder b)]) = _$PokemonSpritesOtherHome;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonSpritesOtherHomeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonSpritesOtherHome> get serializer => _$PokemonSpritesOtherHomeSerializer();
}

class _$PokemonSpritesOtherHomeSerializer implements PrimitiveSerializer<PokemonSpritesOtherHome> {
  @override
  final Iterable<Type> types = const [PokemonSpritesOtherHome, _$PokemonSpritesOtherHome];

  @override
  final String wireName = r'PokemonSpritesOtherHome';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonSpritesOtherHome object, {
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
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonSpritesOtherHome object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonSpritesOtherHomeBuilder result,
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonSpritesOtherHome deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonSpritesOtherHomeBuilder();
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


