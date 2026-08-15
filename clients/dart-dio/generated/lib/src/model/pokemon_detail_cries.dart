//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_detail_cries.g.dart';

/// PokemonDetailCries
///
/// Properties:
/// * [latest] 
/// * [legacy] 
@BuiltValue()
abstract class PokemonDetailCries implements Built<PokemonDetailCries, PokemonDetailCriesBuilder> {
  @BuiltValueField(wireName: r'latest')
  String get latest;

  @BuiltValueField(wireName: r'legacy')
  String get legacy;

  PokemonDetailCries._();

  factory PokemonDetailCries([void updates(PokemonDetailCriesBuilder b)]) = _$PokemonDetailCries;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonDetailCriesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonDetailCries> get serializer => _$PokemonDetailCriesSerializer();
}

class _$PokemonDetailCriesSerializer implements PrimitiveSerializer<PokemonDetailCries> {
  @override
  final Iterable<Type> types = const [PokemonDetailCries, _$PokemonDetailCries];

  @override
  final String wireName = r'PokemonDetailCries';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonDetailCries object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'latest';
    yield serializers.serialize(
      object.latest,
      specifiedType: const FullType(String),
    );
    yield r'legacy';
    yield serializers.serialize(
      object.legacy,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonDetailCries object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonDetailCriesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'latest':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.latest = valueDes;
          break;
        case r'legacy':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
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
  PokemonDetailCries deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonDetailCriesBuilder();
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

