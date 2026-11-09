//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/generation_summary.dart';
import 'package:openapi/src/model/pokemon_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_past_type.g.dart';

/// PokemonPastType
///
/// Properties:
/// * [generation] - The last generation in which the referenced pokémon had the listed types.
/// * [types] - The types the referenced pokémon had up to and including the listed generation.
@BuiltValue()
abstract class PokemonPastType implements Built<PokemonPastType, PokemonPastTypeBuilder> {
  /// The last generation in which the referenced pokémon had the listed types.
  @BuiltValueField(wireName: r'generation')
  GenerationSummary get generation;

  /// The types the referenced pokémon had up to and including the listed generation.
  @BuiltValueField(wireName: r'types')
  BuiltList<PokemonType> get types;

  PokemonPastType._();

  factory PokemonPastType([void updates(PokemonPastTypeBuilder b)]) = _$PokemonPastType;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonPastTypeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonPastType> get serializer => _$PokemonPastTypeSerializer();
}

class _$PokemonPastTypeSerializer implements PrimitiveSerializer<PokemonPastType> {
  @override
  final Iterable<Type> types = const [PokemonPastType, _$PokemonPastType];

  @override
  final String wireName = r'PokemonPastType';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonPastType object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'generation';
    yield serializers.serialize(
      object.generation,
      specifiedType: const FullType(GenerationSummary),
    );
    yield r'types';
    yield serializers.serialize(
      object.types,
      specifiedType: const FullType(BuiltList, [FullType(PokemonType)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonPastType object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonPastTypeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'generation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(GenerationSummary),
          ) as GenerationSummary;
          result.generation.replace(valueDes);
          break;
        case r'types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonType)]),
          ) as BuiltList<PokemonType>;
          result.types.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonPastType deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonPastTypeBuilder();
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


