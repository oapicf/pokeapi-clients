//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_cries.g.dart';

/// PokemonCries
///
/// Properties:
/// * [latest] - The latest depiction of this Pokémon's cry.
/// * [legacy] - The legacy depiction of this Pokémon's cry.
@BuiltValue()
abstract class PokemonCries implements Built<PokemonCries, PokemonCriesBuilder> {
  /// The latest depiction of this Pokémon's cry.
  @BuiltValueField(wireName: r'latest')
  String? get latest;

  /// The legacy depiction of this Pokémon's cry.
  @BuiltValueField(wireName: r'legacy')
  String? get legacy;

  PokemonCries._();

  factory PokemonCries([void updates(PokemonCriesBuilder b)]) = _$PokemonCries;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonCriesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonCries> get serializer => _$PokemonCriesSerializer();
}

class _$PokemonCriesSerializer implements PrimitiveSerializer<PokemonCries> {
  @override
  final Iterable<Type> types = const [PokemonCries, _$PokemonCries];

  @override
  final String wireName = r'PokemonCries';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonCries object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'latest';
    yield object.latest == null ? null : serializers.serialize(
      object.latest,
      specifiedType: const FullType.nullable(String),
    );
    yield r'legacy';
    yield object.legacy == null ? null : serializers.serialize(
      object.legacy,
      specifiedType: const FullType.nullable(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonCries object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonCriesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'latest':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.latest = valueDes;
          break;
        case r'legacy':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.legacy = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonCries deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonCriesBuilder();
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


