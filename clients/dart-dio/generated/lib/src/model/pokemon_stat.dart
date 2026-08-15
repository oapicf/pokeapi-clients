//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/stat_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_stat.g.dart';

/// PokemonStat
///
/// Properties:
/// * [baseStat] 
/// * [effort] 
/// * [stat] 
@BuiltValue()
abstract class PokemonStat implements Built<PokemonStat, PokemonStatBuilder> {
  @BuiltValueField(wireName: r'base_stat')
  int get baseStat;

  @BuiltValueField(wireName: r'effort')
  int get effort;

  @BuiltValueField(wireName: r'stat')
  StatSummary get stat;

  PokemonStat._();

  factory PokemonStat([void updates(PokemonStatBuilder b)]) = _$PokemonStat;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonStatBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonStat> get serializer => _$PokemonStatSerializer();
}

class _$PokemonStatSerializer implements PrimitiveSerializer<PokemonStat> {
  @override
  final Iterable<Type> types = const [PokemonStat, _$PokemonStat];

  @override
  final String wireName = r'PokemonStat';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonStat object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'base_stat';
    yield serializers.serialize(
      object.baseStat,
      specifiedType: const FullType(int),
    );
    yield r'effort';
    yield serializers.serialize(
      object.effort,
      specifiedType: const FullType(int),
    );
    yield r'stat';
    yield serializers.serialize(
      object.stat,
      specifiedType: const FullType(StatSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonStat object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonStatBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'base_stat':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.baseStat = valueDes;
          break;
        case r'effort':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.effort = valueDes;
          break;
        case r'stat':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(StatSummary),
          ) as StatSummary;
          result.stat.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonStat deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonStatBuilder();
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

