//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pokeathlon_stat_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'nature_pokeathlon_stat.g.dart';

/// NaturePokeathlonStat
///
/// Properties:
/// * [maxChange] - The amount of change.
/// * [pokeathlonStat] - The stat being affected.
@BuiltValue()
abstract class NaturePokeathlonStat implements Built<NaturePokeathlonStat, NaturePokeathlonStatBuilder> {
  /// The amount of change.
  @BuiltValueField(wireName: r'max_change')
  int get maxChange;

  /// The stat being affected.
  @BuiltValueField(wireName: r'pokeathlon_stat')
  PokeathlonStatSummary get pokeathlonStat;

  NaturePokeathlonStat._();

  factory NaturePokeathlonStat([void updates(NaturePokeathlonStatBuilder b)]) = _$NaturePokeathlonStat;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(NaturePokeathlonStatBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<NaturePokeathlonStat> get serializer => _$NaturePokeathlonStatSerializer();
}

class _$NaturePokeathlonStatSerializer implements PrimitiveSerializer<NaturePokeathlonStat> {
  @override
  final Iterable<Type> types = const [NaturePokeathlonStat, _$NaturePokeathlonStat];

  @override
  final String wireName = r'NaturePokeathlonStat';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    NaturePokeathlonStat object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'max_change';
    yield serializers.serialize(
      object.maxChange,
      specifiedType: const FullType(int),
    );
    yield r'pokeathlon_stat';
    yield serializers.serialize(
      object.pokeathlonStat,
      specifiedType: const FullType(PokeathlonStatSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    NaturePokeathlonStat object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required NaturePokeathlonStatBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'max_change':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.maxChange = valueDes;
          break;
        case r'pokeathlon_stat':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PokeathlonStatSummary),
          ) as PokeathlonStatSummary;
          result.pokeathlonStat.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  NaturePokeathlonStat deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = NaturePokeathlonStatBuilder();
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


