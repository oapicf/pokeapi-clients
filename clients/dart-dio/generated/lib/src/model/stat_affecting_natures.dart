//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/nature_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'stat_affecting_natures.g.dart';

/// StatAffectingNatures
///
/// Properties:
/// * [increase] - A list of natures and how they change the referenced stat.
/// * [decrease] - A list of nature sand how they change the referenced stat.
@BuiltValue()
abstract class StatAffectingNatures implements Built<StatAffectingNatures, StatAffectingNaturesBuilder> {
  /// A list of natures and how they change the referenced stat.
  @BuiltValueField(wireName: r'increase')
  BuiltList<NatureSummary> get increase;

  /// A list of nature sand how they change the referenced stat.
  @BuiltValueField(wireName: r'decrease')
  BuiltList<NatureSummary> get decrease;

  StatAffectingNatures._();

  factory StatAffectingNatures([void updates(StatAffectingNaturesBuilder b)]) = _$StatAffectingNatures;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(StatAffectingNaturesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<StatAffectingNatures> get serializer => _$StatAffectingNaturesSerializer();
}

class _$StatAffectingNaturesSerializer implements PrimitiveSerializer<StatAffectingNatures> {
  @override
  final Iterable<Type> types = const [StatAffectingNatures, _$StatAffectingNatures];

  @override
  final String wireName = r'StatAffectingNatures';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    StatAffectingNatures object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'increase';
    yield serializers.serialize(
      object.increase,
      specifiedType: const FullType(BuiltList, [FullType(NatureSummary)]),
    );
    yield r'decrease';
    yield serializers.serialize(
      object.decrease,
      specifiedType: const FullType(BuiltList, [FullType(NatureSummary)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    StatAffectingNatures object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required StatAffectingNaturesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'increase':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(NatureSummary)]),
          ) as BuiltList<NatureSummary>;
          result.increase.replace(valueDes);
          break;
        case r'decrease':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(NatureSummary)]),
          ) as BuiltList<NatureSummary>;
          result.decrease.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  StatAffectingNatures deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = StatAffectingNaturesBuilder();
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


