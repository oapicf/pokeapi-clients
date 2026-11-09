//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_sprites_other_dream_world.g.dart';

/// PokemonSpritesOtherDreamWorld
///
/// Properties:
/// * [frontDefault] - The URL of the default Pokémon Dream World front image, or null if unavailable.
/// * [frontFemale] - The URL of the female Pokémon Dream World front image, or null if unavailable.
@BuiltValue()
abstract class PokemonSpritesOtherDreamWorld implements Built<PokemonSpritesOtherDreamWorld, PokemonSpritesOtherDreamWorldBuilder> {
  /// The URL of the default Pokémon Dream World front image, or null if unavailable.
  @BuiltValueField(wireName: r'front_default')
  String? get frontDefault;

  /// The URL of the female Pokémon Dream World front image, or null if unavailable.
  @BuiltValueField(wireName: r'front_female')
  String? get frontFemale;

  PokemonSpritesOtherDreamWorld._();

  factory PokemonSpritesOtherDreamWorld([void updates(PokemonSpritesOtherDreamWorldBuilder b)]) = _$PokemonSpritesOtherDreamWorld;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonSpritesOtherDreamWorldBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonSpritesOtherDreamWorld> get serializer => _$PokemonSpritesOtherDreamWorldSerializer();
}

class _$PokemonSpritesOtherDreamWorldSerializer implements PrimitiveSerializer<PokemonSpritesOtherDreamWorld> {
  @override
  final Iterable<Type> types = const [PokemonSpritesOtherDreamWorld, _$PokemonSpritesOtherDreamWorld];

  @override
  final String wireName = r'PokemonSpritesOtherDreamWorld';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonSpritesOtherDreamWorld object, {
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
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonSpritesOtherDreamWorld object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonSpritesOtherDreamWorldBuilder result,
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonSpritesOtherDreamWorld deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonSpritesOtherDreamWorldBuilder();
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


