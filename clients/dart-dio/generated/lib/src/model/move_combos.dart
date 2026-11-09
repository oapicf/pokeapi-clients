//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/move_combo_usage.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_combos.g.dart';

/// MoveCombos
///
/// Properties:
/// * [normal] - A detail of moves this move can be used before or after, granting additional appeal points in contests.
/// * [super_] - A detail of moves this move can be used before or after, granting additional appeal points in super contests.
@BuiltValue()
abstract class MoveCombos implements Built<MoveCombos, MoveCombosBuilder> {
  /// A detail of moves this move can be used before or after, granting additional appeal points in contests.
  @BuiltValueField(wireName: r'normal')
  MoveComboUsage get normal;

  /// A detail of moves this move can be used before or after, granting additional appeal points in super contests.
  @BuiltValueField(wireName: r'super')
  MoveComboUsage get super_;

  MoveCombos._();

  factory MoveCombos([void updates(MoveCombosBuilder b)]) = _$MoveCombos;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveCombosBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveCombos> get serializer => _$MoveCombosSerializer();
}

class _$MoveCombosSerializer implements PrimitiveSerializer<MoveCombos> {
  @override
  final Iterable<Type> types = const [MoveCombos, _$MoveCombos];

  @override
  final String wireName = r'MoveCombos';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveCombos object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'normal';
    yield serializers.serialize(
      object.normal,
      specifiedType: const FullType(MoveComboUsage),
    );
    yield r'super';
    yield serializers.serialize(
      object.super_,
      specifiedType: const FullType(MoveComboUsage),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MoveCombos object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveCombosBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'normal':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MoveComboUsage),
          ) as MoveComboUsage;
          result.normal.replace(valueDes);
          break;
        case r'super':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MoveComboUsage),
          ) as MoveComboUsage;
          result.super_.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MoveCombos deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveCombosBuilder();
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


