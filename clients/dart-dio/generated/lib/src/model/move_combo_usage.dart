//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/move_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_combo_usage.g.dart';

/// MoveComboUsage
///
/// Properties:
/// * [useBefore] - A list of moves to use before this move.
/// * [useAfter] - A list of moves to use after this move.
@BuiltValue()
abstract class MoveComboUsage implements Built<MoveComboUsage, MoveComboUsageBuilder> {
  /// A list of moves to use before this move.
  @BuiltValueField(wireName: r'use_before')
  BuiltList<MoveSummary>? get useBefore;

  /// A list of moves to use after this move.
  @BuiltValueField(wireName: r'use_after')
  BuiltList<MoveSummary>? get useAfter;

  MoveComboUsage._();

  factory MoveComboUsage([void updates(MoveComboUsageBuilder b)]) = _$MoveComboUsage;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveComboUsageBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveComboUsage> get serializer => _$MoveComboUsageSerializer();
}

class _$MoveComboUsageSerializer implements PrimitiveSerializer<MoveComboUsage> {
  @override
  final Iterable<Type> types = const [MoveComboUsage, _$MoveComboUsage];

  @override
  final String wireName = r'MoveComboUsage';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveComboUsage object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'use_before';
    yield object.useBefore == null ? null : serializers.serialize(
      object.useBefore,
      specifiedType: const FullType.nullable(BuiltList, [FullType(MoveSummary)]),
    );
    yield r'use_after';
    yield object.useAfter == null ? null : serializers.serialize(
      object.useAfter,
      specifiedType: const FullType.nullable(BuiltList, [FullType(MoveSummary)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MoveComboUsage object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveComboUsageBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'use_before':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(MoveSummary)]),
          ) as BuiltList<MoveSummary>?;
          if (valueDes == null) continue;
          result.useBefore.replace(valueDes);
          break;
        case r'use_after':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(MoveSummary)]),
          ) as BuiltList<MoveSummary>?;
          if (valueDes == null) continue;
          result.useAfter.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MoveComboUsage deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveComboUsageBuilder();
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


