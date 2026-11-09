//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pokemon_stat.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/generation_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_past_stat.g.dart';

/// PokemonPastStat
///
/// Properties:
/// * [generation] - The last generation in which the referenced pokémon had the listed stats.
/// * [stats] - The stat the Pokémon had up to and including the listed generation.
@BuiltValue()
abstract class PokemonPastStat implements Built<PokemonPastStat, PokemonPastStatBuilder> {
  /// The last generation in which the referenced pokémon had the listed stats.
  @BuiltValueField(wireName: r'generation')
  GenerationSummary get generation;

  /// The stat the Pokémon had up to and including the listed generation.
  @BuiltValueField(wireName: r'stats')
  BuiltList<PokemonStat> get stats;

  PokemonPastStat._();

  factory PokemonPastStat([void updates(PokemonPastStatBuilder b)]) = _$PokemonPastStat;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonPastStatBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonPastStat> get serializer => _$PokemonPastStatSerializer();
}

class _$PokemonPastStatSerializer implements PrimitiveSerializer<PokemonPastStat> {
  @override
  final Iterable<Type> types = const [PokemonPastStat, _$PokemonPastStat];

  @override
  final String wireName = r'PokemonPastStat';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonPastStat object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'generation';
    yield serializers.serialize(
      object.generation,
      specifiedType: const FullType(GenerationSummary),
    );
    yield r'stats';
    yield serializers.serialize(
      object.stats,
      specifiedType: const FullType(BuiltList, [FullType(PokemonStat)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonPastStat object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonPastStatBuilder result,
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
        case r'stats':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonStat)]),
          ) as BuiltList<PokemonStat>;
          result.stats.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonPastStat deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonPastStatBuilder();
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


